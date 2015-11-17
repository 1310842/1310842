package de.hsmannheim.tpe.ws15.clan;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.mutant.Schurke;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.KoerperschaftssteuerI;

/**
 * Die Klasse Syndikat definiert einen Aufnahmebereich für Schurken.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class Syndikat {

	/**
	 * Anlegung des Attributs syndikatName vom Datentyp String zur Benennung des Syndikats.
	 * Anlegung des Objekts Arraylist syndikat vom Typ Schurke. Die Arrayliste
	 * bietet einen Aufnahmebereich für Objekte des Typs Schurken.
	 */

	private String syndikatName;
	private ArrayList<Schurke> syndikat = new ArrayList<Schurke>();

	/**
	 * Der Konstruktor zeigt auf das Attribute syndikatName und definiert einen
	 * Übergabeparameter. Bei jedem Aufruf des Konstruktors Syndikat wird
	 * gleichzeitig die Methode anmelden von der Klasse Finanzamt aufgerufen.
	 * 
	 * @param syndikatName
	 * 
	 */
	public Syndikat(String syndikatName) {
		this.syndikatName = syndikatName;
		Finanzamt.anmelden(this);

	}

	/**
	 * Die Methode holt die Arrayliste syndikat und macht sie durch die Rückgabe
	 * von syndikat zugreifbar.
	 * 
	 * @return syndikat
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
	 * Die Methode addSchurke zeigt auf das Attribute syndikat und fügt den
	 * Übergabeparameter schurke von der Klasse Schurke hinein.
	 * 
	 * @param schurke
	 */

	public void addSchurke(Schurke schurke) {
		this.syndikat.add(schurke);

	}

	/**
	 * Die Methode getSyndikatName macht das Attribute syndikatName für äußere
	 * Einflüsse zugreifbar.
	 * 
	 * @return syndikatName
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
