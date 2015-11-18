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
	 * Anlegung des Attributs syndikatName zur Benennung des Syndikats und
	 * anlegung der Arraylist syndikat vom Typ Schurke zum Speichern der
	 * Schurken.
	 */

	private String syndikatName;
	private ArrayList<Schurke> syndikat = new ArrayList<Schurke>();

	/**
	 * Instanziierung der Klasse Syndikat als Konstruktor. Der Übergabeparameter
	 * definiert einen Anfangswert für das Objekt Syndikat.
	 * 
	 * @param übergibt
	 *            den Namen zur Benennung des Syndikats.
	 */
	public Syndikat(String syndikatName) {
		this.syndikatName = syndikatName;
		Finanzamt.anmelden(this);

	}

	/**
	 * Die Methode getsyndikat macht die Arraylist des Typs Schurke durch den
	 * Rückgabewert zugreifbar.
	 * 
	 * @return gibt die Liste <b>syndikat</b> zurück.
	 */

	public ArrayList<Schurke> getSyndikat() {
		return syndikat;
	}

	/**
	 * Die Methode addSchurke ermöglicht das Anlegen von Objekten des Typs
	 * Schurke in die Arraylist syndikat.
	 * 
	 * @param übergibt
	 *            den Schurken in die Arraylist syndikat.
	 */

	public void addSchurke(Schurke schurke) {
		this.syndikat.add(schurke);

	}

	/**
	 * Die Methode getSyndikatName macht das Attribute syndikatName für äußere
	 * Einflüsse zugreifbar.
	 * 
	 * @return gibt syndikatName zur Benennung zurück.
	 */

	public String getSyndikatName() {
		return syndikatName;
	}

	/**
	 * Die Methode berechneKoerperschaftssteuer holt das Einkommen der
	 * Mitglieder, die im Syndikat vorhanden sind und berechnet die
	 * Koerperschaftssteuer.
	 * 
	 * @return gibt den Nettoeinkommen des Syndikats aus.
	 */

	public int berechneKoerperschaftssteuer() {
		int einkommen = 0;
		for (Schurke s : syndikat) {
			einkommen += s.getEinkommen();

		}

		einkommen = (int) (einkommen * KoerperschaftssteuerI.LINEARKOERPERSTEUER);

		return einkommen;

	}

	/**
	 * Die Methode toString gibt den Name des Syndikats mit dem Name des
	 * Schurken aus.
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
