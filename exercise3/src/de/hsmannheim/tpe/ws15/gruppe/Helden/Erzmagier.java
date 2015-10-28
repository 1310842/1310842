package de.hsmannheim.tpe.ws15.gruppe.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Mensch;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;

public class Erzmagier extends Mensch{
	
	/** Attribute
	 */
	public double bonus = 5.0;
	
	/** Constructor
	 */
	public Erzmagier () {
		super();
		super.setPreis(220);
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
