package de.hsmannheim.tpe.ws15.mensch;

import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.steuer.Einkommensteuer;

public class Buerger extends Mensch implements EinkommenssteuerI {

	public Buerger(String name, int einkommen, int alter) {
		super(name, einkommen, alter);
		Finanzamt.anmelden(this);
	}

	@Override
	public int berechneEinkommenssteuer() {
		return (Einkommensteuer.berechneEinkommensSteuer(this.einkommen));

	}

	@Override
	public String toString() {
		return (this.getName() + "ist" + this.getAlter() + "Jahre alt.");
	}

}
