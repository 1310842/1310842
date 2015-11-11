package de.hsmannheim.tpe.ws15.Mensch;

import de.hsmannheim.tpe.ws15.Metropolis.Einwohner;

public abstract class Mensch extends Einwohner {

	private int alter;

	public Mensch(String name, int einkommen, int alter) {
		super(name, einkommen);
		this.alter = alter;
	}

	public int getAlter() {
		return alter;
	}

	private void setAlter(int alter) {
		this.alter = alter;
	}

}
