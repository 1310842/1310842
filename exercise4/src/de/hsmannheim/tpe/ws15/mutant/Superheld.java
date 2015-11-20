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
	 * Instanziierung der Klasse Superheld.
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
	 * Die Methode <b>kaempfe</b> simuliert einen Kampf zwischen Superheld und Schurke
	 * 
	 * @param <b>schurke</b> mit dem der Superheld kämpfen soll
	 * 
	 * @return gibt <b>true</b>(Superheld hat gewonnen) oder <b>false</b>(Superheld hat verloren) zurück.
	 */

	public boolean kaempfen(Schurke schurke) {
		if (this.list.contains(schurke.getSchwaeche())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Die Methode <b>addSuperkraft</b> fügt einen neuen Superkraft in die Liste ein
	 * 
	 * @param <b>superkraft</b> der eingefügt werden soll
	 */

	public void addSuperkraft(String superkraft) {
		this.list.add(superkraft);
	}

	/**
	 * Die Methode getList gibt die <b>list</b> die mit Superkräft des Superheldens befüllt ist zurück
	 * 
	 * @return gibt <b>list</b> mit Superkräfte zurück.
	 */

	public ArrayList<String> getList() {
		return list;
	}

}
