package de.hsmannheim.tpe.ws15.simulation;

import de.hsmannheim.tpe.ws15.clan.Syndikat;
import de.hsmannheim.tpe.ws15.mensch.Buerger;
import de.hsmannheim.tpe.ws15.mensch.Richter;
import de.hsmannheim.tpe.ws15.mutant.Schurke;
import de.hsmannheim.tpe.ws15.mutant.Superheld;
import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.unternehmen.Kapitalgesellschaft;
import de.hsmannheim.tpe.ws15.unternehmen.Personengesellschaft;

/**
 * Die Klasse Simulation präsentiert alle Lebewesen, Syndikat und Unternehmen.
 * Die Lebewesen
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Simulation {

	public static void main(String[] args) {

		/**
		 * Anlegung der Syndikate syn1 und syn2 mit deren Name.
		 */
		Syndikat syn1 = new Syndikat("Fantastic 1");
		Syndikat syn2 = new Syndikat("Fantastic 2");

		/**
		 * Instanziierung der Schurken s1, s2 und s3 mit deren Name, Einkommen
		 * und Mutation.
		 */
		Schurke s1 = new Schurke("Azog der Schänder", 27990, "Orkismus");
		Schurke s2 = new Schurke("Hannibal Lecter", 19910, "Legendismus");
		Schurke s3 = new Schurke("Onox", 270201, "Kannibalismus");

		/**
		 * Instanziierung der Superhelden su1 und s2 mit deren Name, Einkommen
		 * und Mutation.
		 */

		Superheld su1 = new Superheld("Kuebra", 10000, "Humanismus");
		Superheld su2 = new Superheld("Isra", 20000, "Metamorphismus");

		/**
		 * Instanziierung der Richter r1 und r2 mit deren Name, Einkommen, alter
		 * und ob sie korrupt sind oder nicht.
		 */

		Richter r1 = new Richter("Gerten", 1000, 99, false);
		Richter r2 = new Richter("Todorov", 500, 111, true);

		/**
		 * Instanziierung der Buerger m1 und m2 mit deren Name, Einkommen und
		 * Alter.
		 */

		Buerger m1 = new Buerger("Zeynep", 5000, 55);
		Buerger m2 = new Buerger("Inan", 6000, 11);

		/**
		 * Instanziierung der Personengesellschaft mit Name und Gewinn.
		 */
		Personengesellschaft p1 = new Personengesellschaft("Saturn", 100000);

		/**
		 * Instanziierung der Kapitalgesellschaft mit Name und Gewinn.
		 */
		Kapitalgesellschaft k1 = new Kapitalgesellschaft("Media Markt", 20000);

		/**
		 * Schurke s1 und s2 schließen sich im Syndikat syn2 zusammen.
		 */
		syn2.addSchurke(s1);
		syn2.addSchurke(s2);

		/**
		 * Konsolenausgabe über den Zusammenschluss von Schurke s1 und Schurke
		 * s2 in ein Syndikat und die Ausgabe der Berechnung der Gesamtsteuern.
		 */
		System.out.println(
				s1.getName() + " " + "und" + " " + s2.getName() + "haben sich in ein Syndikat zusammengeschlossen.");
		System.out.println(syn2.toString());
		System.out.println("Gesamtssteuer: " + Finanzamt.berechneGesamtsteuer());

		Schurke schurke123 = new Schurke("Schurkii", 2000, "Feuer");
		System.out.println("Gesamtssteuer: " + Finanzamt.berechneGesamtsteuer());

	}

}
