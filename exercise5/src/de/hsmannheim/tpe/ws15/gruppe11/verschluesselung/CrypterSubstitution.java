package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalMessageException;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.Crypter;

/**
 * Die Klasse CrypterSubstitution stellt eine Verschluesselungsmethode dar. In
 * dieser werden die einzelnen Buchstaben einer Nachricht mit anderen Buchstaben
 * ersetzt.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class CrypterSubstitution implements Crypter {

    CrypterSubstitution() {
        super();
    }

    /**
     * Verschluesselt eine Nachricht mit einem als Parameter übergegebene
     * Schluessel.
     * 
     * @param key
     *            Schluessel für die Verschluesselung
     * @param message
     *            Verschluesselung der Nachricht
     * @return gibt die verschluesselte Nachricht zurueck
     */

    @Override
    public String encrypt(String key, String message)
            throws IllegalKeyException, IllegalMessageException {

        if (key.length() != Tool.getLaenge()) {
            throw new IllegalKeyException("Schluessellaenge ungueltig");
        }

        if (!Tool.obGrossbuchstabe(key)) {
            throw new IllegalKeyException(
                    "Schluessel enthaelt ungueltige Buchstaben");
        }

        if (!Tool.differentLetter(key)) {
            throw new IllegalKeyException(
                    "Schluessel hat min. zwei mal die gleiche Buchstabe");
        }
        message = message.toUpperCase();

        String encrypt = "";

        for (int i = 0; i < message.length(); i++) {
            encrypt += key.charAt(message.charAt(i) - 'A');
        }

        return encrypt;

    }

    /**
     * Enthschluesselt die als Parameter uebergegebene Verschluesselte Nachricht
     * mit dem dazugehoerenden Schluessel
     * 
     * @param key
     *            Schluessel die für die Entschluesselung notwendig ist
     * @param cyperText
     *            Verschluesselte Nachricht
     * 
     * @return gibt die entschluesselte Nachricht zurück
     */

    @Override
    public String decrypt(String key, String cypherText)
            throws IllegalKeyException, IllegalMessageException {

        if (key.length() != Tool.getLaenge()) {
            throw new IllegalKeyException("Schluessellaenge ungueltig");
        }

        if (!Tool.obGrossbuchstabe(key)) {
            throw new IllegalKeyException(
                    "Schluessel enthaelt ungültige Buchstaben");
        }

        if (!Tool.differentLetter(key)) {
            throw new IllegalKeyException(
                    "Schluessel hat min. zwei mal die gleiche Buchstabe");
        }

        cypherText = cypherText.toUpperCase();
        char[] keyArray = key.toCharArray();

        String decrypt = "";

        for (int i = 0; i < cypherText.length(); i++) {

            decrypt += (char) (Tool.getIndex(cypherText.charAt(i), keyArray) + 'A');
        }

        return decrypt;

    }

}
