package de.hsmannheim.tpe.ws15.clan;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.mutant.Schurke;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.KoerperschaftssteuerI;

/**
 * Klasse für Instanzierung eines Syndikats
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class Syndikat {

	private String syndikatName;
	private ArrayList<Schurke> syndikat = new ArrayList<Schurke>();

	/**
	 * Instanzierung eines Syndikats mit Name. Syndikat wird automatisch an das
	 * Finanzamt gemeldet
	 * 
	 * @param <b>syndikatName</b> Name des Syndikats
	 * 
	 */
	public Syndikat(String syndikatName) {
		this.syndikatName = syndikatName;
		Finanzamt.anmelden(this);

	}

	/**
	 * Gibt die Liste der Schurken des Syndikats zurück
	 * 
	 * @return gibt die <b>syndikat</b> Liste zurück
	 */

	public ArrayList<Schurke> getSyndikat() {
		return syndikat;
	}

	/**
	 * Durch die Methode setSyndikat wird die aktuelle Liste mit dem übergebenen
	 * Liste ersetzt
	 * 
	 * @param <b>syndikat</b> Liste die mit dem aktuellen ersetzt werden soll
	 */
	private void setSyndikat(ArrayList<Schurke> syndikat) {
		this.syndikat = syndikat;
	}

	/**
	 * Die Methode addSchurke fügt ein Schurke in das Syndikat
	 * 
	 * @param schurke
	 *            der eingefügt werden soll
	 */

	public void addSchurke(Schurke schurke) {
		this.syndikat.add(schurke);

	}

	/**
	 * Die Methode getSyndikatName macht das Attribute syndikatName für äußere
	 * Einflüsse zugreifbar.
	 * 
	 * @return gibt syndikatName zurück
	 */

	public String getSyndikatName() {
		return syndikatName;
	}

	/**
	 * Die Setmethode setSyndikatname übergibt den Parameter syndikatName vom
	 * Datentyp String in das Attributfeld syndikatName.
	 * 
	 * @param syndikatName
	 *            des Syndikats
	 */

	private void setSyndikatName(String syndikatName) {
		this.syndikatName = syndikatName;
	}

	/**
	 * Die Methode berechneKoerperschaftssteuer berechnet die Steuer für das
	 * Syndikat. Hier werden alle Einkommen der Schurken aufsummiert und dann
	 * die Steuer berechnet
	 * 
	 * @return gibt die berechnete steuer zurück
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
	 * Die Methode toString gibt detailierte Information über das Objekt
	 * Syndikat wie z.B Syndikatname und Schurken die in das Syndikat
	 * eingetreten sind zurück.
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
