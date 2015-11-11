package de.hsmannheim.tpe.ws15.Unternehmen;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.Mensch.Buerger;

public class Personengesellschaft extends Unternehmen {

	private ArrayList<Buerger> personenListe = new ArrayList<>();

	public Personengesellschaft(String personengesellschaftName) {
		super(personengesellschaftName);
	}

	private ArrayList<Buerger> getPersonenListe() {
		return personenListe;
	}

	private void setPersonenListe(ArrayList<Buerger> personenListe) {
		this.personenListe = personenListe;
	}

}
