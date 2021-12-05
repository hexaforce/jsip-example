package tools.tracesviewer;

import java.io.Serializable;
import java.util.Vector;

public class TracesSessions extends Vector implements Serializable {

	protected String name = null;

	public TracesSessions() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
