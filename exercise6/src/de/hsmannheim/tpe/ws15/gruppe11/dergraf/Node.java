/**
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 * @param <K>
 */

public class Node<K> {

	private final String name;
	private final K wert;
	private final<Node> List children;

	/**Konstruktor
	 * 
	 * @param name
	 * @param wert
	 */
	
	public Node (String name, K wert, <Node> children){
		String name = this.name;
		K wert = this.wert;
		<Node> children = this.children;
	}

	void addChild() {
		return;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private List getChildren() {
		return children;
	}

	private void setChildren(List children) {
		this.children = children;
	}

	private K getWert() {
		return wert;
	}

	void setWert(K Wert) {
		this.wert = wert;
	}
}
