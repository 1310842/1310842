package de.hsmannheim.tpe.ws15.Clan;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.Mutant.Schurke;

public class Syndikat {

	private String syndikatName;

	private ArrayList<Schurke> syndikat = new ArrayList<Schurke>();

	public Syndikat(String syndikatName, int anzahlSchurke) {
		this.syndikatName = syndikatName;

	}

	public void addSchurke(Schurke schurke) {
		this.syndikat.add(schurke);

	}

	private String getSyndikatName() {
		return syndikatName;
	}

	private void setSyndikatName(String syndikatName) {
		this.syndikatName = syndikatName;
	}

}