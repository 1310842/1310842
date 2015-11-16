package de.hsmannheim.tpe.ws15.mutant;

import java.util.ArrayList;

/**
 * Die Klasse SchurkeAzog praesentiert Lebewesen der Rasse Mutant, welcher als
 * Einwohner in der Stadt Metropolis lebt.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Superheld extends Mutant {

	private ArrayList<String> list = new ArrayList<>();

	public Superheld(String name, int einkommen, String mutation) {
		super(name, einkommen, mutation);
	}

	public boolean kaempfen(Schurke schurke) {
		if (this.list.contains(schurke.getSchwaeche())) {
			return true;
		} else {
			return false;
		}
	}

	public void addSuperkraft(String superkraft) {
		this.list.add(superkraft);
	}

	public ArrayList<String> getList() {
		return list;
	}

	private void setList(ArrayList<String> list) {
		this.list = list;
	}

}
