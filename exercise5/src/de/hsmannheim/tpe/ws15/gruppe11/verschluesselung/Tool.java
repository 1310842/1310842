package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

/**
 * Klasse für die Methoden die in den meisten Klassen notwendig sind und zentral
 * gelagert werden.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Tool {

	private final static int MIN = 65;
	private final static int MAX = 90;
	private final static int LAENGE = 26;

	/**
	 * Die Methode obGrossbuchstabe ueberprueft, ob der Schluessel
	 * großgeschrieben ist.
	 * 
	 * @param key
	 *            uebergibt den Schluessel
	 * @return <true> wenn alles in Großbuchstabe ist, <b>false</b> wenn
	 *         mindestens ein Kleinbuchstabe existiert
	 */

	static boolean obGrossbuchstabe(String key) {
		for (int i = 0; i < key.length(); i++) {
			if (key.charAt(i) >= MIN && key.charAt(i) <= MAX) {

			} else {
				return false;
			}
		}
		return true;
	}

	/**
	 * Die Methode ueberprueft, ob die Buchstaben die innerhalb des Textes
	 * maximal einmal vorkommt
	 * 
	 * @param key
	 *            Text der ueberprueft werden soll
	 * @return <b>false</b> wenn mindestens ein Buchstabe doppelt existiert,
	 *         <b>true</b> wenn jedes Buchstaben nur einmal vorkommt
	 */

	static boolean differentLetter(String key) {
		boolean[] letterExist = new boolean[LAENGE];
		int index;

		for (int i = 0; i < letterExist.length; i++) {
			index = key.charAt(i) - 'A';
			if (letterExist[index]) {
				return false;
			} else {
				letterExist[index] = true;
			}

		}
		return true;
	}

	/**
	 * Die Methode getIndex sucht den Index fuer den als Parameter uebergegebenen
	 * Buchstabe in der Schluesselliste und gibt es zurueck.
	 * 
	 * @param gesuchteChar
	 *            Buchstabe der gesucht wird
	 * @param key
	 *            Schluesselliste
	 * @return index der gesuchten Buchstabe innerhalb der Schluesselliste
	 */

	static int getIndex(char gesuchteChar, char[] key) {
		for (int i = 0; i < key.length; i++) {
			if (key[i] == gesuchteChar) {
				return i;
			}
		}

		return 0;
	}

	/**
	 * Gibt Min-Wert der Alphabet von der ASCI Tabelle zurueck
	 * 
	 * @return min Wert der Alphabet von der ASCI Tabelle
	 */
	public static int getMin() {
		return MIN;
	}

	/**
	 * Gibt Max-Wert der Alphabet von der ASCI Tabelle zurueck
	 * 
	 * @return max Wert der Alphabet von der ASCI Tabelle
	 */
	public static int getMax() {
		return MAX;
	}

	/**
	 * Gibt Laenge der Alphabet zurueck
	 * 
	 * @return min Wert der Alphabet von der ASCI Tabelle
	 */
	public static int getLaenge() {
		return LAENGE;
	}

}
