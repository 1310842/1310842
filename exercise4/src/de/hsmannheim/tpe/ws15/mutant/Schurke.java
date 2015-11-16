package de.hsmannheim.tpe.ws15.mutant;

import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.steuer.Einkommensteuer;

/**
 * Die Klasse SchurkeAzog praesentiert Lebewesen der Rasse Mutant, welcher als
 * Einwohner in der Stadt Metropolis lebt.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Schurke extends Mutant implements EinkommenssteuerI {

	private String schwaeche;

	public Schurke(String name, int einkommen, String schwaeche) {
		super(name, einkommen, name);
		this.schwaeche = schwaeche;
		Finanzamt.anmelden(this);
	}

	public String kaempfen(Superheld superheld) {
		if (superheld.getList().contains(this.schwaeche)) {
			return this.getName() + " verliert den Kampf gegen " + superheld.getName();
		} else {
			return this.getName() + " gewinnt den Kampf gegen " + superheld.getName();
		}

	}

	public String getSchwaeche() {
		return schwaeche;
	}

	private void setSchwaeche(String schwaeche) {
		this.schwaeche = schwaeche;
	}

	@Override
	public int berechneEinkommenssteuer() {
		return Einkommensteuer.berechneEinkommensSteuer(this.getEinkommen());
	}

}
