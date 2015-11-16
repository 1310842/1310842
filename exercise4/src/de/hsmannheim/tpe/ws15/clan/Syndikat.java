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

	/**
	 * Die Getmethode holt die Arrayliste syndikat und macht sie zugreifbar.
	 * 
	 * @return
	 */

	public ArrayList<Schurke> getSyndikat() {
		return syndikat;
	}

	/**
	 * Durch die Setmethode setSyndikat lässt sich der Zustand von der Arraylist
	 * syndikat verändern.
	 * 
	 * @param syndikat
	 */
	private void setSyndikat(ArrayList<Schurke> syndikat) {
		this.syndikat = syndikat;
	}

	/**
	 * Durch die Methode addSchurken können Schurken in die ArrayListe
	 * gespeichert werden.
	 * 
	 * @param schurke
	 */

	public void addSchurke(Schurke schurke) {
		this.syndikat.add(schurke);

	}

	/**
	 * Die Getmethode holt den Syndikat Name und macht sie zugreifbar.
	 * 
	 * @return
	 */

	public String getSyndikatName() {
		return syndikatName;
	}

	/**
	 * Die Setmethode setSyndikatname übergibt den Parameter syndikatName vom
	 * Datentyp String in das Attributfeld syndikatName.
	 * 
	 * @param syndikatName
	 */

	private void setSyndikatName(String syndikatName) {
		this.syndikatName = syndikatName;
	}

	/**
	 * Die Methode berechneKoerperschaftssteuer berechnet die Steuer für das
	 * Einkommen des Schurken.
	 * 
	 * Zuerst wird der Variable einkommen vom Datentyp int der Wert 0
	 * zugewiesen. Die Variable s vom Typ Schurke durchläuft die Arraylist
	 * syndikat komplett. Bei jedem durchlauf addiert die Variable s das
	 * Einkommen eines Schurken mit der Variable einkommen drauf. Letztlich wird
	 * das einkommen mit der Koerperschaftssteuer multipliziert und ausgegeben.
	 * 
	 * @return
	 */

	public int berechneKoerperschaftssteuer() {
		int einkommen = 0;
		for (Schurke s : syndikat) {
			einkommen += s.getEinkommen();

		}

		einkommen = (int) (einkommen * KoerperschaftssteuerI.linearKoerperSteuer);

		return einkommen;

	}

	/**
	 * Die Methode toString übergibt Information über die Klasse Syndikat. Sie
	 * initialisiert der Variable Schurke vom Datentyp String einen leeren
	 * String. Dieser wird in der Forschleife mit dem aktuellen Schurkennamen
	 * ersetzt. Letztlich wird der SyndikatName mit dem Name des Schurken
	 * herausgegeben.
	 */

	@Override
	public String toString() {
		String schurken = "";

		for (Schurke s : syndikat) {
			schurken += s.getName() + "\n";
		}
		return (this.syndikatName + "\n" + schurken);
	}
}
