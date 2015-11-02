package de.hsmannheim.tpe.ws15.gruppe11.Helden;


import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Nachtelf;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Squad.Held;

public class Daemonenjaeger extends Nachtelf implements Held {

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
	 * Die Methode attack berechnet den Schaden unter der Berücksichtigung des
	 * Bonusschadens vom Helden.
	 */
	public double attack(Rassen wesen) {
		double damage = this.getGeschwindigkeit() * this.getSchaden()
				* this.bonus;
		int zufall = r.nextInt(1);
		if (zufall == 0) {
			this.setMojo(false);
		} else {
			this.setMojo(true);
		}
		
		if (mojo = false) {
			damage = damage * 0.9;
		} else {
			damage = damage * 1.2;

		}
		double leben = damage - ((wesen.getRuestung() * damage) / 100);
		wesen.setLeben(wesen.getLeben() - leben);
		return damage;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public boolean isMojo() {
		return mojo;
	}

	public void setMojo(boolean mojo) {
		this.mojo = mojo;
	}
	
}
