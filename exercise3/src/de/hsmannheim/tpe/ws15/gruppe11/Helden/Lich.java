package de.hsmannheim.tpe.ws15.gruppe11.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Untote;

public class Lich extends Untote {

	/**
	 * Attribute
	 */
	public double bonus = 2.3;

	/**
	 * Constructor
	 */
	public Lich() {
		super();
		super.setPreis(140);
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
