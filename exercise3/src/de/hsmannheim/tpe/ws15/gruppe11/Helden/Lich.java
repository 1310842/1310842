package de.hsmannheim.tpe.ws15.gruppe11.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Untote;
import de.hsmannheim.tpe.ws15.gruppe11.Squad.Held;

public class Lich extends Untote implements Held{

	/**
	 * Den Attribute bonus haben nur Helden.
	 */
	public double bonus = 2.3;

	/**
	 * Im Konstruktor wird zur Superklasse der Preis des Helden weitergegeben.
	 */
	public Lich() {
		super();
		super.setPreis(140);
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
