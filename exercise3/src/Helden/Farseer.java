package Helden;

import tpe_gruppe11_hs.mannheim.Orks;
import tpe_gruppe11_hs.mannheim.Rassen;

public class Farseer extends Orks{

	/** Attribute
	 */
	public double bonus = 1.2;
	public int preis = 300;
	
	/** Constructor
	 */
	public Farseer () {
		super();
	}
	
	@Override
	public double attack (Rassen rasse) { 
		double damage = super.attack(rasse)*this.bonus;
		return damage;
		
	
		
		
	}

}
