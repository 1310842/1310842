package de.hsmannheim.tpe.ws15.Mutant;

import de.hsmannheim.tpe.ws15.Staat.Finanzamt;

/**
 * Die Klasse SchurkeAzog praesentiert Lebewesen der Rasse Mutant, welcher als
 * Einwohner in der Stadt Metropolis lebt.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Schurke extends Mutant {

	private String schwaeche;

	public Schurke(String name, int einkommen, String mutation) {
		super(name, einkommen, mutation);
		Finanzamt.anmelden(this);
	}

	public boolean kaempfen(Superheld superheld) {
		if (superheld.getList().contains(this.schwaeche)) {
			return false;
		} else {
			return true;
		}

	}

	public String getSchwaeche() {
		return schwaeche;
	}

	private void setSchwaeche(String schwaeche) {
		this.schwaeche = schwaeche;
	}

}
