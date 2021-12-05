package test.unit.gov.nist.javax.sip.parser.extensions;

import gov.nist.javax.sip.parser.extensions.SessionExpiresParser;
import test.unit.gov.nist.javax.sip.parser.ParserTestCase;

public class SessionExpiresParserTest extends ParserTestCase {

	public void testParser() {
		String to[] = { "Session-Expires: 30\n", "Session-Expires: 45;refresher=uac\n", };
		super.testParser(SessionExpiresParser.class, to);

	}

}
