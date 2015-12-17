package de.hsmannheim.tpe.ws15.gruppe11.impl;

import java.util.LinkedList;

import de.hsmannheim.tpe.ws15.gruppe11.interfaces.List;

/**
 * Die Klasse ListImpl implementiert das Interface List und erbt aus der Klasse
 * LinkedList.
 * 
 * @author Car, Isra
 * @author Celik, Kübra
 * 
 * @param <T>
 * 
 */

@SuppressWarnings("serial")
public class ListImpl<T> extends LinkedList<T> implements List<T> {

}