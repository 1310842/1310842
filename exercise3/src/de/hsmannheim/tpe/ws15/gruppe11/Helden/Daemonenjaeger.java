package de.hsmannheim.tpe.ws15.gruppe11.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Nachtelf;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Squad.Held;

public class Daemonenjaeger extends Nachtelf  implements Held {

	/**
	 * Den Attribute bonus haben nur Helden.
	 */
	public double bonus = 3.0;

	/**
	 * Im Konstruktor wird zur Superklasse der Preis des Helden weitergegeben.
	 */
	public Daemonenjaeger() {
		super();
		super.setPreis(290);
	}

	/**
	 * Die Methode attack berechnet den Schaden unter der Berücksichtigung des Bonusschadens vom Helden.
	 */
	public double attack(Rassen wesen) {
		double damage = wesen.getGeschwindigkeit() * wesen.getSchaden()
				* this.bonus;
		double leben = wesen.getLeben() - (super.getRuestung() * damage);
		wesen.setLeben(leben);
		return damage;
	}
}
