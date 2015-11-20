package de.hsmannheim.tpe.ws15.unternehmen;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.mensch.Buerger;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.steuer.Einkommensteuer;

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
	 * Instanziierung der Klasse Personengesellschaft mit den übergebenen Parametern
	 * 
	 * @param <b>personengesellschaftName</b> Name der Personengesellschaft
	 * @param <b>gewinn</b> der Personengesellschaft
	 */

	public Personengesellschaft(String personengesellschaftName, int gewinn) {
		super(personengesellschaftName, gewinn);
		Finanzamt.anmelden(this);

	}

	/**
	 * Die Methode <b>berechneGewerbesteuer</b> berechnet die Gewerbesteuerauf
	 * den Gewinn der Klasse Personengesellschaft und gibt die Steuer zurück die abgeführt werden muss
	 * 
	 * @return <b>steuer</b> die abgeführt werden muss
	 */

	public int berechneGewerbesteuer() {

		int steuer = this.getGewinn() * GEWERBESTEUER / 100;
		if (steuer >= ERMAEßIGUNG) {

			steuer = steuer - ERMAEßIGUNG;
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
