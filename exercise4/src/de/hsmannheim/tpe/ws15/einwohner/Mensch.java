package de.hsmannheim.tpe.ws15.einwohner;

public abstract class Mensch extends Einwohner {

	private int alter;

	public Mensch(String name, int einkommen, int alter) {
		super(name, einkommen);
		this.alter = alter;

	}

}
