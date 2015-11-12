package de.hsmannheim.tpe.ws15.Unternehmen;

import java.util.ArrayList;
import de.hsmannheim.tpe.ws15.Interface.KoerperschaftssteuerI;
import de.hsmannheim.tpe.ws15.Mensch.Buerger;
import de.hsmannheim.tpe.ws15.Staat.Finanzamt;
import de.hsmannheim.tpe.ws15.Steuer.Gewerbesteuer;

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
