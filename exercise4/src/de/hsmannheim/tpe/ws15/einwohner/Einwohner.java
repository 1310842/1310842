package de.hsmannheim.tpe.ws15.einwohner;

/**
 * 
 * @author Kuebra Celik und Isra Car
 *
 */

public abstract class Einwohner {

	protected String name;
	protected int einkommen;

	public Einwohner(String name, int einkommen) {
		this.name = name;
		this.einkommen = einkommen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEinkommen() {
		return einkommen;
	}

	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}

}
