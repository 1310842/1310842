package de.hsmannheim.tpe.ws15.unternehmen;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.mensch.Buerger;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.steuer.Einkommensteuer;
import de.hsmannheim.tpe.ws15.steuer.Gewerbesteuer;

/**
 * Die Klasse Personengesellschaft ist eine Unterklasse der Klasse Unternehmen.
 * Hier werden angelegte Buerger in die Arrayliste personenListe hineingespeichert.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Personengesellschaft extends Unternehmen implements EinkommenssteuerI{

	/**
	 * Arrayliste zum speichern der Buerger.
	 */
	private ArrayList<Buerger> personenListe = new ArrayList<>();
	
	/**
	 * Konstruktor.
	 * @param personengesellschaftName
	 * @param gewinn
	 */
	public Personengesellschaft(String personengesellschaftName, int gewinn) {
		super(personengesellschaftName, gewinn);
		Finanzamt.anmelden(this);

	}
	
	/**
	 * Die Getmethode holt die Buerger aus der Arrayliste personenListe und stellt sie zur Verfügung.
	 * @return
	 */
	private ArrayList<Buerger> getPersonenListe() {
		return personenListe;
	}
	
	/**
	 * Die Setmethode setzt die angelegten Buerger in die Arrayliste personenListe.
	 * @param personenListe
	 */

	private void setPersonenListe(ArrayList<Buerger> personenListe) {
		this.personenListe = personenListe;
	}

	/**
	 * Die Methode berechneGewerbesteuer berechnet die Steuer.
	 * 
	 * @return
	 */

	public int berechneGewerbesteuer() {

		int steuer = this.getGewinn() * Gewerbesteuer.getGewerbesteuer() / 100;
		if (steuer >= 800) {

			steuer = steuer - 800;
		}
		return steuer;
	}

	@Override
	public int berechneEinkommenssteuer() {
		return Einkommensteuer.berechneEinkommensSteuer(this.getGewinn());
	}

}
