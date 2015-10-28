package de.hsmannheim.tpe.ws15.gruppe.Helden;

import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Nachtelf;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;

public class Daemonenjaeger extends Nachtelf{
	
	/** Attribute
	 */
	public double bonus = 3.0;
	
	/** Constructor
	 */
	public Daemonenjaeger () {
		super();
		super.setPreis(290);
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

