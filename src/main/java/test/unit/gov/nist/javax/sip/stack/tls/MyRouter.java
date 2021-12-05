package test.unit.gov.nist.javax.sip.stack.tls;

import java.util.LinkedList;
import java.util.ListIterator;

import javax.sip.SipException;
import javax.sip.SipStack;
import javax.sip.address.Hop;
import javax.sip.address.Router;
import javax.sip.message.Request;

public class MyRouter implements Router {
	protected SipStack myStack;
	protected HopImpl defaultRoute;

	public MyRouter(SipStack sipStack, String nextHop) {

		this.myStack = sipStack;
		this.defaultRoute = new HopImpl(nextHop);
	}

	/**
	 * Always send requests to the default route location.
	 */
	public ListIterator getNextHops(Request sipRequest) {
		LinkedList ll = null;
		if (defaultRoute != null) {
			if (ll == null)
				ll = new LinkedList();
			ll.add(defaultRoute);
			return ll.listIterator();
		} else
			return null;
	}

	public Hop getOutboundProxy() {
		return this.defaultRoute;
	}

	public Hop getNextHop(Request request) throws SipException {
		return this.defaultRoute;
	}

}
