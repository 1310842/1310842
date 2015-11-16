package de.hsmannheim.tpe.ws15.unternehmen;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.mensch.Buerger;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.Gewerbesteuer;
import de.hsmannheim.tpe.ws15.steuer.KoerperschaftssteuerI;

public class Kapitalgesellschaft extends Unternehmen {

	private ArrayList<Buerger> KapitalListe = new ArrayList<Buerger>();

	public Kapitalgesellschaft(String kapitalgesellschaft, int gewinn) {
		super(kapitalgesellschaft, gewinn);
		Finanzamt.anmelden(this);
	}

	public ArrayList<Buerger> getKapitalListe() {
		return KapitalListe;
	}

	public void setKapitalListe(ArrayList<Buerger> kapitalListe) {
		KapitalListe = kapitalListe;
	}

	public int berechneGewerbesteuer() {
		int steuer = this.getGewinn() * Gewerbesteuer.getGewerbesteuer() / 100;
		return steuer;

	}

}
