package de.hsmannheim.tpe.ws15.gruppe11.Gamecontroller;

import java.util.Random;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Squad.Squad;

/**
 * Die Klasse Gamecontroller steuert das ganze Spiel und beinhaltet den ganzen
 * Spielablauf.
 * 
 * @author Kuebra Celik
 * @author Isra Car
 */

public class Gamecontroller {

	/**
	 * Die Konstanten sind für die Squadnamen zuständig.
	 */
	private final String SPIELER1 = "The walking dead";
	private final String SPIELER2 = "The immortal";

	/**
	 * Die Attribute sind zur Bekanntgabe der Runde, Spieler und welche Gruppe
	 * an der Reihe ist.
	 */
	private int runde = 0;
	private int aktuellerSpieler = 1;
	private Squad squad1;
	private Squad squad2;

	/**
	 * Die Methode squadErstellen erstellt Squads und ruft anschließend die
	 * Methode auf, die den Squads mit Einheiten auffüllt. Zum Schluss wird das
	 * Spiel gestartet.
	 */
	public void squadErstellen() {

		squad1 = new Squad(SPIELER1);
		squad1.selectCharakter();

		squad2 = new Squad(SPIELER2);
		squad2.selectCharakter();

		runGame();
	}

	/**
	 * Der Verlierer wird aus der Wesenliste des Squads entfernt, damit kein
	 * weiteres kämpfen des Wesens möglich ist.
	 * 
	 * Die Methode runGame wählt zwei zufällige Wesen aus, die gegeneinander
	 * kämpfen sollen. Zu Beginn wird die Lebendigkeit geprüft anschließend
	 * greift das Wesen im Squad1 als erster an. Gefallene Einheiten werden aus
	 * der Liste entfernt und somit ist keine weitere Aktion dieser Einheit mehr
	 * möglich.
	 * 
	 */
	public void runGame() {

		System.out.println(squad1.toString() + "\n\n" + squad2.toString());
	
		while (squad1.teamLebendig() && squad2.teamLebendig()) {
			this.setRunde(this.getRunde() + 1);

			System.out.println("Runde" + this.getRunde() );
	

			int wesen1Index = random(squad1);
			int wesen2Index = random(squad2);

			Rassen wesen1 = squad1.getEinheitenListe().get(wesen1Index);
			Rassen wesen2 = squad2.getEinheitenListe().get(wesen2Index);

			System.out.println(wesen1.getClass().getSimpleName()
					+ " (Squad 1) vs " + wesen2.getClass().getSimpleName()
					+ " (Squad 2)");
			System.out.println("------------------------------------");

			double damage;
			while (wesen1.isLebendig() && wesen2.isLebendig()) {
				if (this.getAktuellerSpieler() == 1) {
					damage = wesen1.attack(wesen2);
					ausgabeKampf(damage, wesen1, wesen2);
					this.setAktuellerSpieler(2);
				} else if (this.getAktuellerSpieler() == 2) {
					damage = wesen2.attack(wesen1);
					ausgabeKampf(damage, wesen2, wesen1);
					this.setAktuellerSpieler(1);
				}

				if (!(wesen1.isLebendig())) {
					squad1.getEinheitenListe().remove(wesen1Index);
				}
				if (!(wesen2.isLebendig())) {
					squad2.getEinheitenListe().remove(wesen2Index);
				}
			}

			System.out.println("------------------------------------");
			System.out.println("Runde " + this.getRunde() + " wurde beendet");
			if (wesen1.isLebendig()) {
				System.out.println(wesen1.getClass().getSimpleName()
						+ " (Squad 1) hat die Runde gewonnen");
			} else {
				System.out.println(wesen2.getClass().getSimpleName()
						+ " (Squad 2) hat die Runde gewonnen");
			}

		}

		System.out.println("------------------------------------");
		if (squad1.teamLebendig()) {
			System.out.println("Squad 1 '" + squad1.getSquadName()
					+ "' hat gewonnen");
		}
		if (squad2.teamLebendig()) {
			System.out.println("Squad 2 '" + squad2.getSquadName()
					+ "' hat gewonnen");
		}
		System.out.println("\n" + squad1.toString() + "\n\n"
				+ squad2.toString());
	}

	/**
	 * Die Methode ausgabeKampf gibt den aktuellen Schaden, Angreifer und Gegner
	 * an.
	 * 
	 * @param damage
	 * @param angreifer
	 * @param gegner
	 */
	private void ausgabeKampf(double damage, Rassen angreifer, Rassen gegner) {
		System.out.println(angreifer.getClass().getSimpleName() + " greift "
				+ gegner.getClass().getSimpleName() + " an");
		System.out.println(gegner.getClass().getSimpleName() + " hat " + damage
				+ " Schaden erlitten und hat nun " + gegner.getLeben()
				+ " Lebenspunkte");
	}

	/**
	 * Die Methode random erzeugt eine Zufallszahl, diese ist jedoch abhängig
	 * von der Squad List Squad Liste erstellt
	 *
	 * @see java.util.Random
	 * @param squad
	 * @return eine Zufallszahl als Datentyp int
	 */
	private int random(Squad squad) {
		int zufallsIndex = 0;
		Random zufallsGenerator = new Random();

		// Nur eine Zufallszahl erstellen wenn die Squad Liste nicht leer ist
		if (!squad.getEinheitenListe().isEmpty()) {
			zufallsIndex = zufallsGenerator.nextInt(squad.getEinheitenListe()
					.size());
		}
		return zufallsIndex;
	}

	/**
	 * GetMethoden, um Information der in der Klasse Gamecontroller vorhanden
	 * ist zu Verfügung zu stellen. SetMethoden, um beim Ablauf des Programms
	 * die angezeigten Attribute aktualisieren zu können.
	 * 
	 * @return
	 */

	private int getRunde() {
		return this.runde;
	}

	private void setRunde(int runde) {
		this.runde = runde;
	}

	private int getAktuellerSpieler() {
		return this.aktuellerSpieler;
	}

	private void setAktuellerSpieler(int aktuellerSpieler) {
		this.aktuellerSpieler = aktuellerSpieler;
	}
}
