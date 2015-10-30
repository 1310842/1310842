package de.hsmannheim.tpe.ws15.gruppe11.Gamecontroller;

import de.hsmannheim.tpe.ws15.gruppe11.Helden.Daemonenjaeger;
 


import de.hsmannheim.tpe.ws15.gruppe11.Helden.Erzmagier;
import de.hsmannheim.tpe.ws15.gruppe11.Helden.Farseer;
import de.hsmannheim.tpe.ws15.gruppe11.Helden.Lich;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Mensch;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Nachtelf;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Orks;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Untote;
import de.hsmannheim.tpe.ws15.gruppe11.Squad.Squad;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Der JUnit Test zur Überprüfung des Programms.
 *
 */
public class JUnitTest {

    private static final double PRECISION = 0.0001;

    /**
     * Test fuer die Klasse Wesen und alle Rassen
     */
    @Test
    public void testOrks() {

        Orks ork = new Orks();
        assertEquals(100, ork.getLeben(), PRECISION);
        assertEquals(33, ork.getSchaden(), PRECISION);
        assertEquals(1, ork.getGeschwindigkeit(), PRECISION);
        assertEquals(30, ork.getRuestung(), PRECISION);
        assertEquals(150, ork.getPreis(), PRECISION);
    }

    @Test
    public void testFarseer() {
        Farseer farseer = new Farseer();
        assertEquals(100, farseer.getLeben(), PRECISION);
        assertEquals(33, farseer.getSchaden(), PRECISION);
        assertEquals(1, farseer.getGeschwindigkeit(), PRECISION);
        assertEquals(30, farseer.getRuestung(), PRECISION);
        assertEquals(300, farseer.getPreis(), PRECISION);
    }

    @Test
    public void testUntote() {

        Untote untote = new Untote();
        assertEquals(120, untote.getLeben(), PRECISION);
        assertEquals(16, untote.getSchaden(), PRECISION);
        assertEquals(2, untote.getGeschwindigkeit(), PRECISION);
        assertEquals(30, untote.getRuestung(), PRECISION);
        assertEquals(70, untote.getPreis(), PRECISION);
    }

    @Test
    public void testLich() {
        Lich lich = new Lich();
        assertEquals(120, lich.getLeben(), PRECISION);
        assertEquals(16, lich.getSchaden(), PRECISION);
        assertEquals(2, lich.getGeschwindigkeit(), PRECISION);
        assertEquals(30, lich.getRuestung(), PRECISION);
        assertEquals(140, lich.getPreis(), PRECISION);
    }

    @Test
    public void testMensch() {
        Mensch mensch = new Mensch();
        assertEquals(140, mensch.getLeben(), PRECISION);
        assertEquals(40, mensch.getSchaden(), PRECISION);
        assertEquals(2, mensch.getGeschwindigkeit(), PRECISION);
        assertEquals(40, mensch.getRuestung(), PRECISION);
        assertEquals(110, mensch.getPreis(), PRECISION);
    }

    @Test
    public void testErzmagier() {
        Erzmagier erzmagier = new Erzmagier();
        assertEquals(140, erzmagier.getLeben(), PRECISION);
        assertEquals(40, erzmagier.getSchaden(), PRECISION);
        assertEquals(2, erzmagier.getGeschwindigkeit(), PRECISION);
        assertEquals(40, erzmagier.getRuestung(), PRECISION);
        assertEquals(220, erzmagier.getPreis(), PRECISION);
    }

    @Test
    public void testNachtelf() {
        Nachtelf nachtelf = new Nachtelf();
        assertEquals(120, nachtelf.getLeben(), PRECISION);
        assertEquals(15, nachtelf.getSchaden(), PRECISION);
        assertEquals(3, nachtelf.getGeschwindigkeit(), PRECISION);
        assertEquals(20, nachtelf.getRuestung(), PRECISION);
        assertEquals(145, nachtelf.getPreis(), PRECISION);
    }

    @Test
    public void testDaemonenjaeger() {
        Daemonenjaeger daemonenjaeger = new Daemonenjaeger();
        assertEquals(120, daemonenjaeger.getLeben(), PRECISION);
        assertEquals(15, daemonenjaeger.getSchaden(), PRECISION);
        assertEquals(3, daemonenjaeger.getGeschwindigkeit(), PRECISION);
        assertEquals(20, daemonenjaeger.getRuestung(), PRECISION);
        assertEquals(290, daemonenjaeger.getPreis(), PRECISION);
    }

    // Squad erstellen und Wesen einfügen

    @Test
    public void testSquad() {

        Squad squad1 = new Squad("TestSquad1");
        Squad squad2 = new Squad("TestSquad2");

        Rassen ork = new Orks();
        Rassen mensch = new Mensch();

        assertEquals("TestSquad1", squad1.getSquadName());
        assertEquals(0, squad1.getEinheitenListe().size());
        assertEquals("TestSquad2", squad2.getSquadName());
        assertEquals(0, squad2.getEinheitenListe().size());

        squad1.kaufe(ork);
        assertEquals(1850, squad1.getElfendollar(), PRECISION);
        assertEquals(1, squad1.getEinheitenListe().size());
        squad2.kaufe(mensch);
        assertEquals(1890, squad2.getElfendollar(), PRECISION);
        assertEquals(1, squad2.getEinheitenListe().size());
        squad2.kaufe(ork);
        assertEquals(1740, squad2.getElfendollar(), PRECISION);
        assertEquals(2, squad2.getEinheitenListe().size());

        
        

        assertEquals(1, squad1.getEinheitenListe().size());
        assertEquals(2, squad2.getEinheitenListe().size());
        
    }

    @Test
    public void testAttack() {
        Rassen spieler1 = new Daemonenjaeger();
        Rassen spieler2 = new Mensch();

        spieler1.attack(spieler2);
        spieler2.attack(spieler1);
        assertEquals(59.0, spieler2.getLeben(), PRECISION);
        assertEquals(56.0, spieler1.getLeben(), PRECISION);
    }

    /**
     * Ein Test in dem geprüft wird ob der Spieler2 noch angreifen kann obwohl
     * er davor getötet worden ist Der Spieler 2 darf bzw. kann nicht
     * attackieren, da er bereits durch Spieler1 getötet worden ist.
     */
    @Test
    public void testAttack2() {
        Rassen spieler1 = new Erzmagier();
        Rassen spieler2 = new Orks();

        spieler1.attack(spieler2);
        spieler2.attack(spieler1);
        assertEquals(-180.0, spieler2.getLeben(), PRECISION);
        assertEquals(140.0, spieler1.getLeben(), PRECISION);

    }
}