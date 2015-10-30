package de.hsmannheim.tpe.ws15.gruppe11.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Mensch;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Squad.Held;

public class Erzmagier extends Mensch implements Held{

	/**
	 * Attribute
	 */
	public double bonus = 5.0;

	/**
	 * Constructor
	 */
	public Erzmagier() {
		super();
		super.setPreis(220);
	}

	/**
	 * Method attack and decrease life of entity
	 */
	public double attack(Rassen wesen) {
		double damage = this.getGeschwindigkeit() * this.getSchaden()
				* this.bonus;
		double leben = damage - ((wesen.getRuestung() * damage)/100);
		wesen.setLeben(wesen.getLeben()-leben);
		return damage;
	}
}
