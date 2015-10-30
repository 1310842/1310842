package de.hsmannheim.tpe.ws15.gruppe11.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Orks;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Squad.Held;

public class Farseer extends Orks implements Held {

	/**
	 * Den Attribute bonus haben nur Helden.
	 */
	public double bonus = 1.2;

	/**
	 * Im Konstruktor wird zur Superklasse der Preis des Helden weitergegeben.
	 */
	public Farseer() {
		super();
		super.setPreis(300);
	}

	/**
	 * Die Methode attack berechnet den Schaden unter der Berücksichtigung des Bonusschadens vom Helden.
	 */
	public double attack(Rassen wesen) {
		double damage = this.getGeschwindigkeit() * this.getSchaden()
				* this.bonus;
		double leben = damage - ((wesen.getRuestung() * damage)/100);
		wesen.setLeben(wesen.getLeben()-leben);
		return damage;
	}

}
