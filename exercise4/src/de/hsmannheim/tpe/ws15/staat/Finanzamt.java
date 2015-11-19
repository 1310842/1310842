package de.hsmannheim.tpe.ws15.staat;

import java.util.ArrayList;

/**
 * Die Klasse Finanzamt berechnet die Gesamtsteuer für Metropolis.
 */

import de.hsmannheim.tpe.ws15.clan.Syndikat;
import de.hsmannheim.tpe.ws15.mensch.Buerger;
import de.hsmannheim.tpe.ws15.mutant.Schurke;
import de.hsmannheim.tpe.ws15.unternehmen.Kapitalgesellschaft;
import de.hsmannheim.tpe.ws15.unternehmen.Personengesellschaft;

public abstract class Finanzamt {

	/**
	 * Angemeldete Steuerzahler von Metropolis.
	 */

	private static ArrayList<Syndikat> syndikat = new ArrayList<Syndikat>();
	private static ArrayList<Kapitalgesellschaft> kapitalgesellschaft = new ArrayList<Kapitalgesellschaft>();
	private static ArrayList<Buerger> buerger = new ArrayList<Buerger>();
	private static ArrayList<Personengesellschaft> personengesellschaft = new ArrayList<Personengesellschaft>();
	private static ArrayList<Schurke> schurken = new ArrayList<Schurke>();

	/**
	 * Die Methode <b>berechneGesamtsteuer</b> berechnet die Gesamtsteuer für
	 * alle Steuerpflichtigen Elemente.
	 * 
	 * @return <b>gesamtsteuer</b> gibt die Gesamtsteuer zurück.
	 */

	public static int berechneGesamtsteuer() {
		int gesamtsteuer = 0;

		for (Syndikat syndikat : syndikat) {
			gesamtsteuer += syndikat.berechneKoerperschaftssteuer();
		}

		for (Kapitalgesellschaft kap : kapitalgesellschaft) {
			gesamtsteuer += kap.berechneGewerbesteuer();
			gesamtsteuer += kap.berechneGewerbesteuer();
		}

		for (Buerger buerger : buerger) {
			gesamtsteuer += buerger.berechneEinkommenssteuer();
		}

		for (Personengesellschaft pGesellschaft : personengesellschaft) {
			gesamtsteuer += pGesellschaft.berechneEinkommenssteuer();
			gesamtsteuer += pGesellschaft.berechneGewerbesteuer();
		}

		for (Schurke schurken : schurken) {
			gesamtsteuer += schurken.berechneEinkommenssteuer();
		}

		return gesamtsteuer;
	}

	/**
	 * Die statische Methode <b>anmelden</b> fügt das Objekt vom Typ Schurke in
	 * die Arraylist <b>schurke</b>.
	 * 
	 * @param übergibt
	 *            das Objekt <b>schurke</b> in die Arrayliste <b>schurke</b>.
	 */

	public static void anmelden(Schurke schurke) {
		schurken.add(schurke);
	}

	/**
	 * Die statische Methode <b>anmelden</b> fügt das Objekt vom Typ Syndikat in
	 * die Arraylist <b>syndikat</b>.
	 * 
	 * @param übergibt
	 *            das Objekt <b>syn</b> in die Arrayliste <b>syndikat</b>.
	 */

	public static void anmelden(Syndikat syn) {
		syndikat.add(syn);
	}

	/**
	 * Die statische Methode <b>anmelden</b> fügt das Objekt vom Typ
	 * Personengesellschaft in die Arraylist <b>personengesellschaft</b>.
	 * 
	 * @param übergibt
	 *            das Objekt <b>pers</b> in die Arrayliste
	 *            <b>personengesellschaft</b>.
	 */

	public static void anmelden(Personengesellschaft pers) {
		personengesellschaft.add(pers);
	}

	/**
	 * Die statische Methode <b>anmelden</b> fügt das Objekt vom Typ Buerger in
	 * die Arraylist <b>buerger</b>.
	 * 
	 * @param übergibt
	 *            das Objekt <b>buerg</b> in die Arrayliste <b>buerger</b>.
	 */

	public static void anmelden(Buerger buerg) {
		buerger.add(buerg);
	}

	/**
	 * Die statische Methode <b>anmelden</b> fügt das Objekt vom Typ
	 * Kapitalgesellschaft in die Arraylist <b>kapitalgesellschaft</b>.
	 * 
	 * @param übergibt
	 *            das Objekt <b>kap</b> in die Arrayliste
	 *            <b>kapitalgesellschaft</b>.
	 */

	public static void anmelden(Kapitalgesellschaft kap) {
		kapitalgesellschaft.add(kap);
	}
}