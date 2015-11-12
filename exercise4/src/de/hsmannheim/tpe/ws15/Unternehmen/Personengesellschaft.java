package de.hsmannheim.tpe.ws15.Unternehmen;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.Mensch.Buerger;
import de.hsmannheim.tpe.ws15.Staat.Finanzamt;
import de.hsmannheim.tpe.ws15.Steuer.Gewerbesteuer;

public class Personengesellschaft extends Unternehmen {

	private ArrayList<Buerger> personenListe = new ArrayList<>();

	public Personengesellschaft(String personengesellschaftName, int gewinn) {
		super(personengesellschaftName, gewinn);
		Finanzamt.anmelden(this);

	}

	private ArrayList<Buerger> getPersonenListe() {
		return personenListe;
	}

	private void setPersonenListe(ArrayList<Buerger> personenListe) {
		this.personenListe = personenListe;
	}

	public int berechneGewerbesteuer() {

		int steuer = this.getGewinn() * Gewerbesteuer.getGewerbesteuer() / 100;
		if (steuer >= 800) {

			steuer = steuer - 800;
		}
		return steuer;
	}

}
