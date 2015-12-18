package de.hsmannheim.tpe.ws15.gruppe11.simulation;

import de.hsmannheim.tpe.ws15.gruppe11.dergraf.Graph;
import de.hsmannheim.tpe.ws15.gruppe11.dergraf.Node;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.SearchStrategy;
import de.hsmannheim.tpe.ws15.gruppe11.search.SearchFactory;
import de.hsmannheim.tpe.ws15.gruppe11.search.Suchverfahren;

/**
 * Die Klasse Simulation simuliert die Tiefensuchen und Breitensuche.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Simulation {

	public static void main(String[] args) {
		Node<Character> a = new Node<>("A", 'A');
		Node<Character> b = new Node<>("B", 'B');
		Node<Character> c = new Node<>("C", 'C');
		Node<Character> d = new Node<>("D", 'D');
		Node<Character> e = new Node<>("E", 'E');
		Node<Character> f = new Node<>("F", 'F');
		Node<Character> g = new Node<>("G", 'G');
		Node<Character> h = new Node<>("H", 'H');
		Node<Character> i = new Node<>("I", 'I');
		Node<Character> j = new Node<>("J", 'J');
		Node<Character> k = new Node<>("K", 'K');

		Graph<Character> graph = new Graph<>(a);

		a.addChild(b);
		a.addChild(c);
		a.addChild(d);
		b.addChild(a);
		b.addChild(e);
		b.addChild(f);
		b.addChild(g);
		e.addChild(h);
		e.addChild(i);
		f.addChild(j);
		f.addChild(k);
		g.addChild(d);
		h.addChild(b);
		j.addChild(i);
		k.addChild(d);

		System.out.println("Tiefensuche:");
		SearchStrategy<Character> tiefenSuche = SearchFactory.createSearch(Suchverfahren.TIEFENSUCHE);
		System.out.println(tiefenSuche.search(a, 'K'));
		System.out.println(tiefenSuche.getPath());

		System.out.println("\nBreitensuche:");
		SearchStrategy<Character> breitenSuche = SearchFactory.createSearch(Suchverfahren.BREITENSUCHE);
		System.out.println(breitenSuche.search(a, 'K'));
		System.out.println(breitenSuche.getPath());

	}

}