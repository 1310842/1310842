package de.hsmannheim.tpe.ws15.gruppe.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Untote;

public class Lich extends Untote {
	
	/** Attribute
	 */
	public double bonus = 2.3;
	
	/** Constructor
	 */
	public Lich () {
		super();
		super.setPreis(140);
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
