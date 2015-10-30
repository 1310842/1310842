package de.hsmannheim.tpe.ws15.gruppe11.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Orks;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Squad.Held;

public class Farseer extends Orks implements Held {

	/**
	 * Attribute
	 */
	public double bonus = 1.2;

	/**
	 * Constructor
	 */
	public Farseer() {
		super();
		super.setPreis(300);
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
