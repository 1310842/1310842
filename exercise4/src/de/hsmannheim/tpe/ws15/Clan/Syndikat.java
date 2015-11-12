package de.hsmannheim.tpe.ws15.Clan;

import java.util.ArrayList;

import de.hsmannheim.tpe.ws15.Interface.KoerperschaftssteuerI;
import de.hsmannheim.tpe.ws15.Mutant.Schurke;
import de.hsmannheim.tpe.ws15.Staat.Finanzamt;

public class Syndikat  {

	private String syndikatName;

	private ArrayList<Schurke> syndikat = new ArrayList<Schurke>();

	public Syndikat(String syndikatName, int anzahlSchurke) {
		this.syndikatName = syndikatName;
		Finanzamt.anmelden(this);

	}

	public void addSchurke(Schurke schurke) {
		this.syndikat.add(schurke);

	}

	private String getSyndikatName() {
		return syndikatName;
	}

	private void setSyndikatName(String syndikatName) {
		this.syndikatName = syndikatName;
	}

	public int berechneKoerperschaftssteuer() {
		int einkommen = 0;
		for (Schurke s : syndikat) {
			einkommen = s.getEinkommen();

		}

		einkommen = (int) (einkommen * KoerperschaftssteuerI.linearKoerperSteuer);

		return einkommen;

	}
	
	@Override
	public String toString() {
		String schurken = "";
		
		for (Schurke s : syndikat) {
			schurken += s.getName()+"\n";
		}
		return (this.syndikatName + "\n" +schurken);
	}
}
