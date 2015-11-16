package de.hsmannheim.tpe.ws15.simulation;

import static org.junit.Assert.*;
import org.junit.Test;

import de.hsmannheim.tpe.ws15.clan.Syndikat;
import de.hsmannheim.tpe.ws15.mensch.Buerger;
import de.hsmannheim.tpe.ws15.mensch.Richter;
import de.hsmannheim.tpe.ws15.mutant.Schurke;
import de.hsmannheim.tpe.ws15.mutant.Superheld;
import de.hsmannheim.tpe.ws15.unternehmen.Kapitalgesellschaft;
import de.hsmannheim.tpe.ws15.unternehmen.Personengesellschaft;

/**
 * Der JUnit Test zur Überprüfung des Programms.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class JUnit {

	/**
	 * Der JUnit-Test zur isolierten Überprüfung der einzelnen Elemente der
	 * vorhandenen Klassen im Projekt exercise4.
	 */

	@Test
	public void testBuerger() {

		Buerger m1 = new Buerger("Zeynep", 5000, 55);

		assertEquals("Zeynep", m1.getName());
		assertEquals(5000, m1.getEinkommen());
		assertEquals(55, m1.getAlter());

		Buerger m2 = new Buerger("Inan", 6000, 11);

		assertEquals("Inan", m2.getName());
		assertEquals(6000, m2.getEinkommen());
		assertEquals(11, m2.getAlter());

		assertEquals(480, m2.berechneEinkommenssteuer());
	}

	@Test
	public void testRichter() {

		Richter r1 = new Richter("Gerten", 1000, 99, false);

		assertEquals("Gerten", r1.getName());
		assertEquals(1000, r1.getEinkommen());
		assertEquals(99, r1.getAlter());
		assertEquals(false, r1.isKorrupt());

		Richter r2 = new Richter("Todorov", 500, 111, true);

		assertEquals("Todorov", r2.getName());
		assertEquals(500, r2.getEinkommen());
		assertEquals(111, r2.getAlter());
		assertEquals(true, r2.isKorrupt());
	}

	@Test
	public void testSchurke() {

		Schurke s1 = new Schurke("Azog der Schänder", 27990, "Orkismus");

		assertEquals("Azog der Schänder", s1.getName());
		assertEquals(27990, s1.getEinkommen());
		assertEquals("Orkismus", s1.getSchwaeche());

		Schurke s2 = new Schurke("Hannibal Lecter", 19910, "Legendismus");

		assertEquals("Hannibal Lecter", s2.getName());
		assertEquals(19910, s2.getEinkommen());
		assertEquals("Legendismus", s2.getSchwaeche());

		Schurke s3 = new Schurke("Onox", 270201, "Kannibalismus");

		assertEquals("Onox", s3.getName());
		assertEquals(270201, s3.getEinkommen());
		assertEquals("Kannibalismus", s3.getSchwaeche());
	}

	@Test
	public void testSuperheld() {

		Schurke schurke = new Schurke("Schurkiii", 2000, "Humanismus");
		Superheld su1 = new Superheld("Kuebra", 10000, "Humanismus");
		su1.addSuperkraft("Humanismus");

		assertEquals("Kuebra", su1.getName());
		assertEquals(10000, su1.getEinkommen());
		assertEquals("Humanismus", su1.getMutation());

		Superheld su2 = new Superheld("Isra", 20000, "Metamorphismus");

		assertEquals("Isra", su2.getName());
		assertEquals(20000, su2.getEinkommen());
		assertEquals("Metamorphismus", su2.getMutation());
		
		assertEquals("Schurkiii verliert den Kampf gegen Kuebra",schurke.kaempfen(su1));
	}

	@Test
	public void testSyndikat() {

		Syndikat syn1 = new Syndikat("Fantastic 1");

		assertEquals("Fantastic 1", syn1.getSyndikatName());

		Syndikat syn2 = new Syndikat("Fantastic 2");

		assertEquals("Fantastic 2", syn2.getSyndikatName());
	}

	@Test
	public void testUnternehmen() {
		Personengesellschaft p1 = new Personengesellschaft("Saturn", 100000);

		assertEquals("Saturn", p1.getUnternehmenName());
		assertEquals(100000, p1.getGewinn());

		Kapitalgesellschaft k1 = new Kapitalgesellschaft("Media Markt", 20000);

		assertEquals("Media Markt", k1.getUnternehmenName());
		assertEquals(20000, k1.getGewinn());

		assertEquals("Personengesellschaft Saturn, Gewinn: 100000", p1.toString());
		assertEquals("Kapitalgesellschaft Media Markt, Gewinn: 20000", k1.toString());
		assertEquals(14200, p1.berechneGewerbesteuer());
		assertEquals(3000, k1.berechneGewerbesteuer());

	}

	@Test
	public void testSyn1() {

		Syndikat syn1 = new Syndikat("Fantastic 1");

		Schurke s1 = new Schurke("Azog der Schänder", 27990, "Orkismus");
		Schurke s2 = new Schurke("Hannibal Lecter", 19910, "Legendismus");

		syn1.addSchurke(s1);
		syn1.addSchurke(s2);

		assertEquals(2, syn1.getSyndikat().size());
		assertEquals(7185, syn1.berechneKoerperschaftssteuer());
		assertEquals(2798, s1.berechneEinkommenssteuer());
	}

}
