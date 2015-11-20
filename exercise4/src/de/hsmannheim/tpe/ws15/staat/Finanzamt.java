package de.hsmannheim.tpe.ws15.staat;

/**
 * Die Klasse <b>Finanzamt</b> erhält alle Steuerpflichtigen Zahler
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */


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
	 * alle Steuerpflichtigen Objekte
	 * 
	 * @return gibt die <b>gesamtsteuer</b> zurück.
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
	 * Die Methode <b>anmelden</b> fügt das Objekt vom Typ Schurke in
	 * die Steuerzahler Liste ein.
	 * 
	 *  @param  Schurke der eingefügt werden soll
	 */

	public static void anmelden(Schurke schurke) {
		schurken.add(schurke);
	}

	/**
	 * Die Methode <b>anmelden</b> fügt das Objekt vom Typ Syndikat in
	 * die Steuerzahler Liste ein.
	 * 
	 *  @param  Syndikat der eingefügt werden soll
	 */

	public static void anmelden(Syndikat syn) {
		syndikat.add(syn);
	}

	/**
	 * Die Methode <b>anmelden</b> fügt das Objekt vom Typ
	 * Personengesellschaft in die Liste der Steuerzahler ein.
	 * 
	 *  @param  Personengesellschaft der eingefügt werden soll
	 */

	public static void anmelden(Personengesellschaft pers) {
		personengesellschaft.add(pers);
	}

	/**
	 * Die Methode <b>anmelden</b> fügt das Objekt vom Typ Buerger in
	 * die Liste der Steuerzahler ein.
	 * 
	 * @param Bürger der eingefügt werden soll
	 */

	public static void anmelden(Buerger buerg) {
		buerger.add(buerg);
	}

	/**
	 * Die Methode <b>anmelden</b> fügt das Objekt vom Typ
	 * Kapitalgesellschaft in die Liste der Steuerzahler ein.
	 * 
	 * @param Kapitalgesellschaft der eingefügt werden soll
	 */

	public static void anmelden(Kapitalgesellschaft kap) {
		kapitalgesellschaft.add(kap);
	}
}