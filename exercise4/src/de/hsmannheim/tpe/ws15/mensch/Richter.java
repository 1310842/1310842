package de.hsmannheim.tpe.ws15.mensch;

public class Richter extends Mensch {

	private boolean korrupt;

	public Richter(String name, int einkommen, int alter, boolean korrupt) {
		super(name, einkommen, alter);
		this.korrupt = korrupt;

	}

	public boolean verurteilen() {
		if (this.korrupt) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isKorrupt() {
		return korrupt;
	}

	private void setKorrupt(boolean korrupt) {
		this.korrupt = korrupt;
	}

}
