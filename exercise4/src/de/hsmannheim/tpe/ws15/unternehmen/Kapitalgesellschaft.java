package de.hsmannheim.tpe.ws15.unternehmen;

/**
 * Klasse für einen Kapitalgesellschaftenn. Enthält alle Bürger die Inhaber der Kapitallgesellschaft
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.mensch.Buerger;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.KoerperschaftssteuerI;

public class Kapitalgesellschaft extends Unternehmen implements KoerperschaftssteuerI{

	private ArrayList<Buerger> KapitalListe = new ArrayList<Buerger>();

	/**
	 * Instazierung eines Kapitalgesellschaftes mit den übergebenen Parametern.
	 * Nebenbei wird die Kapitalgesellschaft beim Finanzamt angemeldet
	 * 
	 * @param kapitalgesellschaft
	 *            Name des Kapitalgesellschaftes
	 * @param gewinn
	 *            des Kapitalgesellgeschaftes
	 */
	public Kapitalgesellschaft(String kapitalgesellschaft, int gewinn) {
		super(kapitalgesellschaft, gewinn);
		Finanzamt.anmelden(this);
	}

	/**
	 * Die Methode gibt die Liste der Inhaber zurück
	 * 
	 * @return gibt <b>KapitalListe</b> Inhaber des Gesellschaftes als liste zurück
	 */

	public ArrayList<Buerger> getKapitalListe() {
		return KapitalListe;
	}

	/**
	 * 
	 * Die Methode <b>setKapitalListe</b> überschreibt das Attribut
	 * <b>KapitalListe</b>.
	 * 
	 * @param kapitalListe die mit dem aktuellen Liste ersetzt werden soll
	 */

	private void setKapitalListe(ArrayList<Buerger> kapitalListe) {
		KapitalListe = kapitalListe;
	}

	/**
	 * Die Methode <b>berechneKoerperschaftsSteuer</b> berechnet die
	 * Koerperschaftssteuer auf den Gewinn der Klasse Kapitalgesellschaft.
	 * 
	 * @return gibt die <b>steuer</b> die abgeführt werden muss zurück
	 */

	public int berechneKoerperschaftsSteuer() {
		int steuer = (int) (this.getGewinn() * LINEARKOERPERSTEUER);
		return steuer;
	}

}
