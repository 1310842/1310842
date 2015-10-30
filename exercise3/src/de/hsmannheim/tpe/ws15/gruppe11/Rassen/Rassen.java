package de.hsmannheim.tpe.ws15.gruppe11.Rassen;

public class Rassen {

	/**
	 * Attribute die alle Wesen besitzen
	 */
	private double leben;
	private double schaden;
	private double geschwindigkeit;
	private double ruestung;
	private double preis;

	/**
	 * Konstruktor
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
	 * Methode zur Schadensberechnung
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
	 * Method die die Lebendigkeit überprüft
	 */
	public boolean isLebendig() {
		if (this.leben > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Die Setmethode setzt die aktuellen Lebenspunkte
	 * @param leben
	 */
	public void setLeben(double leben) {
		this.leben = leben;
	}

	/**
	 * Getmethode die den Schaden freigibt
	 * 
	 */
	public double getSchaden() {
		return this.schaden;
	}

	/**
	 * Die Setmethode setzt den aktuellen Schaden.
	 * @param schaden
	 */
	public void setSchaden(double schaden) {
		this.schaden = schaden;
	}

	/**
	 * Die Getmethode gibt die aktuelle Geschwindigkeit frei.
	 */
	public double getGeschwindigkeit() {
		return this.geschwindigkeit;
	}

	/**
	 * Die Setmethode setzt die aktuelle Geschwindigkeit.
	 * @param geschwindigkeit
	 */
	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	/**
	 * Die Getmethode gibt die aktuelle Rüstung frei.
	 */
	public double getRuestung() {
		return this.ruestung;
	}

	/**
	 * Die Setmethode setzt die aktuelle Ruestung.
	 * @param ruestung
	 */
	public void setRuestung(double ruestung) {
		this.ruestung = ruestung;
	}

	/**
	 * Die Getmethode gibt den aktuellen Preis frei.
	 */
	public double getPreis() {
		return this.preis;
	}

	/**
	 * Die Setmethode setzt den aktuellen Preis.
	 * @param preis
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}


	 /**
     * Die Getmethode die das Attribute leben freigibt.
     */
    public double getLeben() {
    	return this.leben;

    }
    
    /**
	 * Die Methode toString überschreibt die vorhandenen Attribute.
	 */
	@Override
    public String toString() {
        return (this.getClass().getSimpleName() + ": " + this.getLeben()
                + " Lebenspunkte, " + this.getGeschwindigkeit()
                + " Geschwindigkeit, " + this.getSchaden() + " Schaden, "
                + this.getRuestung() + "Rüstung");
    }
}
