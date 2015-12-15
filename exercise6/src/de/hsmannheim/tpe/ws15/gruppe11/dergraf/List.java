package de.hsmannheim.tpe.ws15.gruppe11.dergraf;


public interface List<T> extends Iterable<T> {

	/**
     * Prüfen ob Elements bereits vorhanden ist
     * @param e Element
     * @return true falls vorhanden, ansonsten false
     */
    public abstract boolean contains(Object e);

    /**
     * Fügt Element e hinzu
     * @param e Element, welches hinzugefügt werden soll
     * @return true
     */
    public abstract boolean add(T e);

    /**
     * Hinzufügen von Element e am Anfang
     * @param e Element
     */
    public abstract void addFirst(T e);

    /**
     * Liefert das erste Element
     * @return erste Element e
     */
    public abstract T peekFirst();

    /**
     * Prüft ob leer
     * @return true wenn leer, ansonsten false
     */
    public abstract boolean isEmpty();

    /**
     * Entfernen vom ersten Element und gleichzeitig liefern
     * @return erste Element e
     */
    public abstract T pollFirst();

    /**
     * Löscht die Liste
     */
    public abstract void clear();
}