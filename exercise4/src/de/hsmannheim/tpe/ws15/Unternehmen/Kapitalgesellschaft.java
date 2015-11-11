package de.hsmannheim.tpe.ws15.Unternehmen;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.Mensch.Buerger;

public class Kapitalgesellschaft extends Unternehmen {

	private ArrayList<Buerger> KapitalListe = new ArrayList<Buerger>();

	private ArrayList<Buerger> getKapitalListe() {
		return KapitalListe;
	}

	public Kapitalgesellschaft(String kapitalgesellschaft) {
		super(kapitalgesellschaft);
	}

	private void setKapitalListe(ArrayList<Buerger> kapitalListe) {
		KapitalListe = kapitalListe;
	}

}
