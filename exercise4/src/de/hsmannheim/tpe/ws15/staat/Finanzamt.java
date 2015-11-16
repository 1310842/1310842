package de.hsmannheim.tpe.ws15.staat;

import java.util.ArrayList;

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

    public static int berechneGesamtsteuer() {
        int gesamtsteuer = 0;

        // Berechnung der Körperschaftsteuer des Syndikats
        for (Syndikat syndikat : syndikat) {
            gesamtsteuer += syndikat.berechneKoerperschaftssteuer();
        }

        // Berechnung der Körperschafts und Gewerbesteuer des
        // Kapitalgesellschaftes
        for (Kapitalgesellschaft kap : kapitalgesellschaft) {
            gesamtsteuer += kap.berechneGewerbesteuer();
            gesamtsteuer += kap.berechneGewerbesteuer();
        }

        // Berechnung der Einkommensteuer von Bürger
        for (Buerger buerger : buerger) {
            gesamtsteuer += buerger.berechneEinkommenssteuer();
        }

        // Berechnung der Einkommen und Gewerbesteuer von Personengesellschaften
        for (Personengesellschaft pGesellschaft : personengesellschaft) {
            gesamtsteuer += pGesellschaft.berechneEinkommenssteuer();
            gesamtsteuer += pGesellschaft.berechneGewerbesteuer();
        }

        // Berechnung der Einkommensteuer von Schurken
        for (Schurke schurken : schurken) {
            gesamtsteuer += schurken.berechneEinkommenssteuer();
        }

        return gesamtsteuer;
    }

	public static void anmelden(Schurke schurke) {
		schurken.add(schurke);
	}

	public static void anmelden(Syndikat syn) {
		syndikat.add(syn);
	}

	public static void anmelden(Personengesellschaft pers) {
		personengesellschaft.add(pers);
	}

	public static void anmelden(Buerger buerg) {
		buerger.add(buerg);
	}

	public static void anmelden(Kapitalgesellschaft kap) {
		kapitalgesellschaft.add(kap);
	}
}