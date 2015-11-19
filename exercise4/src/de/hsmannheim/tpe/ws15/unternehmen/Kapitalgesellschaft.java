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

	/**
	 * Die Methode <b>getKapitalListe</b> gibt <b>KapitalListe</b> zurück und
	 * macht sie zugreifbar.
	 * 
	 * @return <b>KapitalListe</b> 
	 */

	public ArrayList<Buerger> getKapitalListe() {
		return KapitalListe;
	}

	/**
	 * Die Methode <b>setKapitalListe</b> überschreibt das Attribut
	 * <b>KapitalListe</b>.
	 * 
	 * @param kapitalListe
	 */

	public void setKapitalListe(ArrayList<Buerger> kapitalListe) {
		KapitalListe = kapitalListe;
	}

	/**
	 * Die Methode <b>berechneGewerbesteuer</b> berechnet die Gewerbesteuer auf
	 * den Gewinn der Klasse Kapitalgesellschaft.
	 * 
	 * @return <b>steuer</b> gibt den Nettogewinn zurück.
	 */

	public int berechneGewerbesteuer() {
		int steuer = this.getGewinn() * Gewerbesteuer.getGewerbesteuer() / 100;
		return steuer;
	}

	/**
	 * Die Methode <b>berechneKoerperschaftsSteuer</b> berechnet die
	 * Koerperschaftssteuer auf den Gewinn der Klasse Kapitalgesellschaft.
	 * 
	 * @return <b>steuer</b> gibt den Nettogewinn zurück.
	 */

	public int berechneKoerperschaftsSteuer() {
		int steuer = (int) (this.getGewinn() * KoerperschaftssteuerI.LINEARKOERPERSTEUER);
		return steuer;
	}

}
