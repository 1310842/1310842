package de.hsmannheim.tpe.ws15.gruppe.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Orks;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;

public class Farseer extends Orks{

	/** Attribute
	 */
	public double bonus = 1.2;
	
	/** Constructor
	 */
	public Farseer () {
		super();
		super.setPreis(300);
	}
	
	/** Method attack and decrease life of entity
	 */
	public double attack (Rassen wesen) {
		double damage = wesen.getGeschwindigkeit()*wesen.getSchaden()*this.bonus;
		double leben = wesen.getLeben() - damage;
		wesen.setLeben(leben);
		return damage;
	}
	
}
