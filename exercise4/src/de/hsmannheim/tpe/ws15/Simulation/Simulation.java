package de.hsmannheim.tpe.ws15.Simulation;

import de.hsmannheim.tpe.ws15.Clan.Syndikat;
import de.hsmannheim.tpe.ws15.Mensch.Buerger;
import de.hsmannheim.tpe.ws15.Mensch.Richter;
import de.hsmannheim.tpe.ws15.Mutant.Schurke;
import de.hsmannheim.tpe.ws15.Mutant.Superheld;
import de.hsmannheim.tpe.ws15.Staat.Finanzamt;
import de.hsmannheim.tpe.ws15.Unternehmen.Kapitalgesellschaft;
import de.hsmannheim.tpe.ws15.Unternehmen.Personengesellschaft;

public class Simulation {

	public static void main(String[] args) {

		Syndikat syn1 = new Syndikat("Fantastic 2", 2);

		Schurke s1 = new Schurke("Azog der Schänder", 27990, "Orkismus");
		Schurke s2 = new Schurke("Hannibal Lecter", 19910, "Legendismus");
		Schurke s3 = new Schurke("Onox", 270201, "Kannibalismus");

		Superheld su1 = new Superheld("Kuebra", 10000, "Humanismus");
		Superheld su2 = new Superheld("Isra", 20000, "Metamorphismus");

		Richter r1 = new Richter("Gerte", 1000, 99, false);
		Richter r2 = new Richter("Todorov", 500, 111, true);

		Buerger m1 = new Buerger("Zeynep", 5000, 55);
		Buerger m2 = new Buerger("Inan", 6000, 11);

		Syndikat syn11 = new Syndikat("Mafia", 2);

		/**
		 * Unternehmen
		 */
		Personengesellschaft p1 = new Personengesellschaft("Saturn", 100000);

		Kapitalgesellschaft k1 = new Kapitalgesellschaft("Media Markt", 20000);

		syn11.addSchurke(s1);
		syn11.addSchurke(s2);
		System.out.println(s1.getName() + s2.getName() + "haben sich in ein Syndikat zusammengeschlossen.");
		
		System.out.println(syn11.toString());
		
		System.out.println(Finanzamt.berechneGesamtsteuer());

	}

}
