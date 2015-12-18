package de.hsmannheim.tpe.ws15.gruppe11.simulation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl;

import de.hsmannheim.tpe.ws15.gruppe11.dergraf.Graph;
import de.hsmannheim.tpe.ws15.gruppe11.dergraf.Node;
import de.hsmannheim.tpe.ws15.gruppe11.impl.NodeListImpl;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.NodeList;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.SearchStrategy;
import de.hsmannheim.tpe.ws15.gruppe11.search.SearchFactory;
import de.hsmannheim.tpe.ws15.gruppe11.search.Suchverfahren;

/**
 * JUnit Test
 * 
 * @author Car, Isra
 * @author Celik, Kübra
 * 
 */

public class JUnit {

	@Test
	public void testNodeUNodeList() {
		Node<Integer> zahl1 = new Node<>("Zahl", 1);
		Node<Integer> zahl2 = new Node<>("Zahl", 2);
		Node<String> string1 = new Node<>("String", "String 2");
		Node<String> string2 = new Node<>("String", "String 2");

		NodeList<Integer> zahlList = new NodeListImpl<>();
		NodeList<String> stringList = new NodeListImpl<>();

		zahlList.add(zahl2);
		stringList.add(string2);

		string1.addChild(string2);
		zahl1.addChild(zahl2);
		assertEquals(zahlList, zahl1.getChildren());
		assertEquals(stringList, string1.getChildren());

	}

	@Test
	public void testGraph() {

		Node<Character> node = new Node<>("A", 'A');

		Graph<Character> graphTest = new Graph<>(node);
		NodeList<Character> newList = new NodeListImpl<>();

		newList = graphTest.copyInto(newList);

		assertEquals(true, newList.contains(node));
		assertEquals(node, graphTest.getRoot());

	}

	@Test
	public void testBreitensuche() {
		Node<Character> node = new Node<>("A", 'A');
		Node<Character> childB = new Node<>("B", 'B');
		Node<Character> childC = new Node<>("C", 'C');
		Node<Character> childD = new Node<>("D", 'D');
		Node<Character> childE = new Node<>("E", 'E');
		Node<Character> childF = new Node<>("F", 'F');
		Node<Character> childG = new Node<>("G", 'G');
		Node<Character> childH = new Node<>("H", 'H');
		Node<Character> childI = new Node<>("I", 'I');
		Node<Character> childJ = new Node<>("J", 'J');
		Node<Character> childK = new Node<>("K", 'K');
		Node<Character> childL = new Node<>("L", 'L');
		Node<Character> childM = new Node<>("M", 'M');
		Node<Character> childN = new Node<>("N", 'N');
		Node<Character> childO = new Node<>("O", 'O');
		Node<Character> childP = new Node<>("P", 'P');

		Graph<Character> graphBreitensuche = new Graph<>(node);
		node.addChild(childB);
		node.addChild(childC);
		node.addChild(childD);

		childB.addChild(childE);
		childB.addChild(childF);
		childB.addChild(childG);

		childE.addChild(childH);
		childE.addChild(childI);

		childF.addChild(childJ);
		childF.addChild(childK);

		childC.addChild(childL);
		childC.addChild(childM);

		childM.addChild(childN);

		childD.addChild(childO);
		childD.addChild(childP);

		SearchStrategy<Character> breitensuche = SearchFactory.createSearch(Suchverfahren.BREITENSUCHE);

		NodeList<?> breitenSucheErg = breitensuche.search(node, 'J');
		assertEquals(true, breitenSucheErg.contains(childJ));

		NodeList<?> breitensuchePfad = breitensuche.getPath();
		NodeList<Character> breitenSuchePfadErwartet = new NodeListImpl<>();
		breitenSuchePfadErwartet.add(node);
		breitenSuchePfadErwartet.add(childB);
		breitenSuchePfadErwartet.add(childC);
		breitenSuchePfadErwartet.add(childD);
		breitenSuchePfadErwartet.add(childE);
		breitenSuchePfadErwartet.add(childF);
		breitenSuchePfadErwartet.add(childG);
		breitenSuchePfadErwartet.add(childL);
		breitenSuchePfadErwartet.add(childM);
		breitenSuchePfadErwartet.add(childO);
		breitenSuchePfadErwartet.add(childP);
		breitenSuchePfadErwartet.add(childH);
		breitenSuchePfadErwartet.add(childI);
		breitenSuchePfadErwartet.add(childJ);
		breitenSuchePfadErwartet.add(childK);
		breitenSuchePfadErwartet.add(childN);

		assertEquals(true, breitensuchePfad.equals(breitenSuchePfadErwartet));

	}

	@Test
	public void testTiefensuche() {
		Node<Character> node = new Node<>("A", 'A');
		Node<Character> childB = new Node<>("B", 'B');
		Node<Character> childC = new Node<>("C", 'C');
		Node<Character> childD = new Node<>("D", 'D');
		Node<Character> childE = new Node<>("E", 'E');
		Node<Character> childF = new Node<>("F", 'F');
		Node<Character> childG = new Node<>("G", 'G');
		Node<Character> childH = new Node<>("H", 'H');
		Node<Character> childI = new Node<>("I", 'I');
		Node<Character> childJ = new Node<>("J", 'J');
		Node<Character> childK = new Node<>("K", 'K');
		Node<Character> childL = new Node<>("L", 'L');
		Node<Character> childM = new Node<>("M", 'M');
		Node<Character> childN = new Node<>("N", 'N');
		Node<Character> childO = new Node<>("O", 'O');
		Node<Character> childP = new Node<>("P", 'P');

		Graph<Character> graph = new Graph<>(node);
		node.addChild(childB);
		node.addChild(childC);
		node.addChild(childD);

		childB.addChild(childE);
		childB.addChild(childF);
		childB.addChild(childG);

		childE.addChild(childH);
		childE.addChild(childI);

		childF.addChild(childJ);
		childF.addChild(childK);

		childC.addChild(childL);
		childC.addChild(childM);

		childM.addChild(childN);

		childD.addChild(childO);
		childD.addChild(childP);

		SearchStrategy<Character> tiefenSucheMethode = SearchFactory.createSearch(Suchverfahren.TIEFENSUCHE);
		NodeList<?> tiefenSuche = tiefenSucheMethode.search(node, 'J');
		assertEquals(true, tiefenSuche.contains(childJ));

		NodeList<?> tiefenSuchePfad = tiefenSucheMethode.getPath();
		NodeList<Character> tiefenSuchePfadErwartet = new NodeListImpl<>();
		tiefenSuchePfadErwartet.add(node);
		tiefenSuchePfadErwartet.add(childB);
		tiefenSuchePfadErwartet.add(childE);
		tiefenSuchePfadErwartet.add(childH);
		tiefenSuchePfadErwartet.add(childI);
		tiefenSuchePfadErwartet.add(childF);
		tiefenSuchePfadErwartet.add(childJ);
		tiefenSuchePfadErwartet.add(childK);
		tiefenSuchePfadErwartet.add(childG);
		tiefenSuchePfadErwartet.add(childC);
		tiefenSuchePfadErwartet.add(childL);
		tiefenSuchePfadErwartet.add(childM);
		tiefenSuchePfadErwartet.add(childN);
		tiefenSuchePfadErwartet.add(childD);
		tiefenSuchePfadErwartet.add(childO);
		tiefenSuchePfadErwartet.add(childP);

		assertEquals(true, tiefenSuchePfad.equals(tiefenSuchePfadErwartet));

	}

}