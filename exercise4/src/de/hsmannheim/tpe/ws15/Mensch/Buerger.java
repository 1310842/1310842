package de.hsmannheim.tpe.ws15.Mensch;

import de.hsmannheim.tpe.ws15.Interface.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.Staat.Finanzamt;
import de.hsmannheim.tpe.ws15.Steuer.Einkommenssteuer;

public class Buerger extends Mensch implements EinkommenssteuerI {

	public Buerger(String name, int einkommen, int alter) {
		super(name, einkommen, alter);
		Finanzamt.anmelden(this);
	}

	@Override
	public int berechneEinkommenssteuer() {
		return (EinkommenssteuerI.berechneEinkommensSteuer(this.einkommen));

	}

	@Override
	public String toString() {
		return (this.getName() + "ist" + this.getAlter() + "Jahre alt.");
	}

}
