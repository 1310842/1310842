package de.hsmannheim.tpe.ws15.unternehmen;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.mensch.Buerger;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.steuer.Einkommensteuer;
import de.hsmannheim.tpe.ws15.steuer.Gewerbesteuer;

/**
 * Die Klasse Personengesellschaft ist eine Unterklasse der Klasse Unternehmen.
 * In dieser sind die Buerger, die eine Personengesellschaft haben gespeichert.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Personengesellschaft extends Unternehmen implements EinkommenssteuerI {

	/**
	 * Deklaration der Arraylist <b>personenListe</b> vom Typ Buerger.
	 */

	private ArrayList<Buerger> personenListe = new ArrayList<>();

	/**
	 * Instanziierung der Klasse Personengesellschaft als Konstruktor.
	 * 
	 * @param übergibt
	 *            den Parameter <b>personengesellschaftName</b> an die
	 *            Oberklasse.
	 * @param übergibt
	 *            den Parameter <b>gewinn</b> an die Oberklasse.
	 */

	public Personengesellschaft(String personengesellschaftName, int gewinn) {
		super(personengesellschaftName, gewinn);
		Finanzamt.anmelden(this);

	}

	/**
	 * Die Methode <b>berechneGewerbesteuer</b> berechnet die Gewerbesteuerauf
	 * den Gewinn der Klasse Personengesellschaft und gibt das Nettoeinkommen
	 * zurück.
	 * 
	 * @return <b>steuer</b> gibt das Nettoeinkommen zurück.
	 */

	public int berechneGewerbesteuer() {

		int steuer = this.getGewinn() * Gewerbesteuer.getGewerbesteuer() / 100;
		if (steuer >= 800) {

			steuer = steuer - 800;
		}
		return steuer;
	}

	/**
	 * Die Methode <b>berechneEinkommensteuer</b> berechnet die Einkommensteuer
	 * auf den Gewinn der Klasse Personengesellschaft.
	 * 
	 * @return gibt die Einkommensteuer zurück.
	 */

	public int berechneEinkommenssteuer() {
		return Einkommensteuer.berechneEinkommensSteuer(this.getGewinn());
	}

}
