package de.hsmannheim.tpe.ws15.gruppe11.Squad;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.gruppe11.Helden.Daemonenjaeger;
import de.hsmannheim.tpe.ws15.gruppe11.Helden.Erzmagier;
import de.hsmannheim.tpe.ws15.gruppe11.Helden.Farseer;
import de.hsmannheim.tpe.ws15.gruppe11.Helden.Lich;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Mensch;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Nachtelf;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Orks;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Rassen;
import de.hsmannheim.tpe.ws15.gruppe11.Rassen.Untote;

/**
 * In der Klasse Squads werden Squads erstellt und diese auch mit Wesen aufgefüllt.
 * 
 * @author Kuebra Celik
 * @author Isra Car
 */
public class Squad {

	/**
	 * Anlegung der ArrayList
	 */
	private String squadName;
	private ArrayList<Rassen> einheitenListe = new ArrayList<>();
	private double elfendollar;

	/**
	 * Zur Umbenennung des Squads und zur Setzung des Geldbetrages.
	 */
	public Squad(String squadName) {
		this.setSquadName(squadName);
		this.setElfendollar(2000);

	}
	
	/**
	 * Methode Random gibt eine zufällige Zahl zwischen 1 und 8 aus. Diese Zufallszahl bestimmt das Attribut
	 * zufallsIndex.
	 * @return
	 */
	 int random() {
	        int zufallsIndex = 0;

	        if (this.getElfendollar() >= 70) {
	            zufallsIndex = (int) ((Math.random() * 8) + 1);
	        }
	        return zufallsIndex;
	    }

/**
 * Die Methode selectCharakter kauft Einheiten und Helden ein bis Elfendollar nicht mehr reicht.
 */
    public void selectCharakter() {
        boolean fertig = false;

        while (!fertig) {

            Rassen orks = new Orks();
            Rassen farseer = new Farseer();
            Rassen untote = new Untote();
            Rassen lich = new Lich();
            Rassen mensch = new Mensch();
            Rassen erzmagier = new Erzmagier();
            Rassen nachtelf = new Nachtelf();
            Rassen daemonenjaeger = new Daemonenjaeger();

            switch (this.random()) {
            case 1:
                kaufe(orks);
                break;
            case 2:
                kaufe(farseer);
                break;
            case 3:
                kaufe(untote);
                break;
            case 4:
                kaufe(lich);
                break;
            case 5:
                kaufe(mensch);
                break;
            case 6:
                kaufe(erzmagier);
                break;
            case 7:
                kaufe(nachtelf);
                break;
            case 8:
                kaufe(daemonenjaeger);
                break;
            case 0:
                fertig = true;
                break;
            default:
            }
        }

    }
    
    public String kaufe(Rassen wesen) {

/**
 * Prüfung ob der Held
 */
    	if (istHeld(wesen) && checkAnfuehrer(wesen)) {
            return (wesen.getClass().getSimpleName()
                    + " ist bereits ein Anführer");
        } else {
            
        	/**
        	 * Prüfung ob genügend Elfendollar vorhanden ist.
        	 */
        	
            if (this.getElfendollar() >= wesen.getPreis()) {
                this.setElfendollar(this.getElfendollar() - wesen.getPreis());
                this.getEinheitenListe().add(wesen);
                return ("Du hast " + wesen.getClass().getSimpleName()
                        + " gekauft ");
            } else {
                return ("Nicht genügend Elfendollar");
            }
        }

    }
    
    private boolean checkAnfuehrer(Rassen wesen) {
        for (Rassen i : einheitenListe) {
            if (i.getClass().equals(wesen.getClass())) {
                return true;
            }
        }
        return false;
    }
    

	public String getSquadName() {
		return squadName;
	}

	public void setSquadName(String squadName) {
		this.squadName = squadName;
	}

	public ArrayList<Rassen> getEinheitenListe() {
		return einheitenListe;
	}

	public void setEinheitenListe(ArrayList<Rassen> einheitenListe) {
		this.einheitenListe = einheitenListe;
	}

	public double getElfendollar() {
		return this.elfendollar;
	}

	public void setElfendollar(double d) {
		this.elfendollar = d;
	}

	@Override
	public String toString() {
		String einheitenListe = "";

		for (Rassen i : this.einheitenListe) {
			einheitenListe += i.getClass().getSimpleName() + "\n";

		}

		return "Squad" + this.getSquadName() + ", hat noch"
				+ this.getElfendollar()
				+ "Elfendollar mit dem Squad:\n"
				+ einheitenListe;
	}

	/**
	 * Method at least 1 unit in ArrayList
	 * 
	 * @return
	 */
	public boolean teamLebendig() {
		if (this.getEinheitenListe().isEmpty()) {
			return false;
		}
		return true;
	}

	/**
	 * Method hero
	 */
	boolean istHeld(Rassen wesen) {
		if (wesen instanceof Held) {
			return true;
		} else {
			return false;
		}
	}
}
