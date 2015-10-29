package de.hsmannheim.tpe.ws15.gruppe11.Rassen;

public class Rassen {

	/**
	 * Attribute
	 */
	private double leben;
	private double schaden;
	private double geschwindigkeit;
	private double ruestung;
	private double preis;

	/**
	 * Constructor
	 * 
	 * @param leben
	 * @param schaden
	 * @param geschwindigkeit
	 * @param rüstung
	 */
	public Rassen(double leben, double schaden, double geschwindigkeit,
			double rüstung, double preis) {
		this.leben = leben;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.ruestung = rüstung;
		this.preis = preis;
	}

	/**
	 * Method attack and decrease life of entity
	 */
	public double attack(Rassen wesen) {
		double damage = 0;
		if(this.isLebendig()){

		damage = this.geschwindigkeit * this.schaden;
		damage = damage - ((wesen.ruestung * damage)/100);
		double leben = wesen.getLeben() - damage;
		wesen.setLeben(leben);
		}
		
		return damage;
	}

	/**
	 * Method isLebendig
	 */
	public boolean isLebendig() {
		if (this.leben > 0) {
			return true;
		}
		return false;
	}





	public void setLeben(double leben) {
		this.leben = leben;
	}

	/**
	 * Method Get to offer damage
	 */
	public double getSchaden() {
		return this.schaden;
	}

	/**
	 * Method Set to change status damage
	 */
	public void setSchaden(double schaden) {
		this.schaden = schaden;
	}

	/**
	 * Method Get to offer velocity
	 */
	public double getGeschwindigkeit() {
		return this.geschwindigkeit;
	}

	/**
	 * Method Set to change velocity
	 */
	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	/**
	 * Method Get to offer armor
	 */
	public double getRuestung() {
		return this.ruestung;
	}

	/**
	 * Method Set to change status armor
	 */
	public void setRuestung(double ruestung) {
		this.ruestung = ruestung;
	}

	/**
	 * Method Get to offer price
	 */
	public double getPreis() {
		return this.preis;
	}

	/**
	 * Method Set to change status price
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}

	/**
	 * Method toString
	 */
	@Override
    public String toString() {
        return (this.getClass().getSimpleName() + ": " + this.getLeben()
                + " Lebenspunkte, " + this.getGeschwindigkeit()
                + " Geschwindigkeit, " + this.getSchaden() + " Schaden, "
                + this.getRuestung() + "Rüstung");
    }

	 /**
     * 
     * @return
     */
    public double getLeben() {
    	return this.leben;

    }
}
