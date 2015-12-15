package de.hsmannheim.tpe.ws15.gruppe11.dergraf;

public interface SearchStrategy<T> {

	public static void search(Node<T> rootNode, T value) {

	}

	public NodeList<T> getPath();

}
