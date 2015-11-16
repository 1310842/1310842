package de.hsmannheim.tpe.ws15.clan;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.mutant.Schurke;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.KoerperschaftssteuerI;

/**
 * Die Klasse Syndikat präsentiert einen Zusammenschluss mehrerer Schurken.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class Syndikat {

	/**
	 * Attribute. Aufgenommene Schurken werden in eine Liste gespeichert.
	 */

	private String syndikatName;
	private ArrayList<Schurke> syndikat = new ArrayList<Schurke>();

	/**
	 * Konstruktor.
	 * 
	 * @param syndikatName
	 */
	public Syndikat(String syndikatName) {
		this.syndikatName = syndikatName;
		Finanzamt.anmelden(this);

	}

	public ArrayList<Schurke> getSyndikat() {
		return syndikat;
	}

	private void setSyndikat(ArrayList<Schurke> syndikat) {
		this.syndikat = syndikat;
	}

	/**
	 * Durch die Methode addSchurken können Schurken in die ArrayListe gespeichert
	 * werden.
	 * 
	 * @param schurke
	 */

	public void addSchurke(Schurke schurke) {
		this.syndikat.add(schurke);

	}

	/**
	 * Getmethode holt den Syndikat Name.
	 * 
	 * @return
	 */

	public String getSyndikatName() {
		return syndikatName;
	}

	/**
	 * Setmethode zum Benennen des Syndikats.
	 * 
	 * @param syndikatName
	 */

	private void setSyndikatName(String syndikatName) {
		this.syndikatName = syndikatName;
	}

	public int berechneKoerperschaftssteuer() {
		int einkommen = 0;
		for (Schurke s : syndikat) {
			einkommen += s.getEinkommen();

		}

		einkommen = (int) (einkommen * KoerperschaftssteuerI.linearKoerperSteuer);

		return einkommen;

	}

	@Override
	public String toString() {
		String schurken = "";

		for (Schurke s : syndikat) {
			schurken += s.getName() + "\n";
		}
		return (this.syndikatName + "\n" + schurken);
	}
}
