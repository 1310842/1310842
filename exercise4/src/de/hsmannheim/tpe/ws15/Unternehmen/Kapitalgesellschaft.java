package de.hsmannheim.tpe.ws15.Unternehmen;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.Interface.KoerperschaftssteuerI;
import de.hsmannheim.tpe.ws15.Mensch.Buerger;

public class Kapitalgesellschaft extends Unternehmen {

	private ArrayList<Buerger> KapitalListe = new ArrayList<Buerger>();

	private ArrayList<Buerger> getKapitalListe() {
		return KapitalListe;
	}

	public Kapitalgesellschaft(String kapitalgesellschaft, int gewinn) {
		super(kapitalgesellschaft, gewinn);
	}

	private void setKapitalListe(ArrayList<Buerger> kapitalListe) {
		KapitalListe = kapitalListe;
	}

	public int berechneKoerperschaftssteuer () {
		int steuer = 0;
		steuer = (int)(this.getGewinn()*KoerperschaftssteuerI.linearKoerperSteuer);
		return steuer;
	}

	
}
