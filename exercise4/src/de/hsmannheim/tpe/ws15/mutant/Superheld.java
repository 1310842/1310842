package de.hsmannheim.tpe.ws15.mutant;

import java.util.ArrayList;

/**
 * Die Klasse <b>Superheld</b> ist eine Unterklasse von <b>Mutant</b>. Sie
 * praesentiert die Eigenschaften des Superhelden.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Superheld extends Mutant {

	/**
	 * Deklaration der Arrayliste <b>list</b>.
	 */

	private ArrayList<String> list = new ArrayList<>();

	/**
	 * Instanziierung der Klasse Superheld als Konstruktor.
	 * 
	 * @param übergibt
	 *            den <b>name</b> des Objekts.
	 * @param übergibt
	 *            das <b>einkommen</b> des Objekts.
	 * @param übergibt
	 *            die <b>mutation</b> des Objekts.
	 */

	public Superheld(String name, int einkommen, String mutation) {
		super(name, einkommen, mutation);
	}

	/**
	 * Die Methode <b>kaempfe</b> überprüft ob Superheld den Schurken besiegen
	 * kann.
	 * 
	 * @param <b>schurke</b>
	 *            übergibt den Namen des Schurken.
	 * @return gibt entweder <b>true</b> oder <b>false</b> zurück.
	 */

	public boolean kaempfen(Schurke schurke) {
		if (this.list.contains(schurke.getSchwaeche())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Die Methode <b>addSuperkraft</b> fügt die <b>superkraft</b> in die
	 * Arraylist <b>list</b> hinzu.
	 * 
	 * @param übergibt
	 *            die <b>superkraft</b> des Superhelden.
	 */

	public void addSuperkraft(String superkraft) {
		this.list.add(superkraft);
	}

	/**
	 * Die Methode getList gibt die <b>list</b> zurück und macht es zugreifbar.
	 * 
	 * @return
	 */

	public ArrayList<String> getList() {
		return list;
	}

}
