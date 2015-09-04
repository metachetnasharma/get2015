package DS8;

/**
 * a class for node of Tree
 * 
 * @author Chetna
 *
 */
public class Node {
	Node left;
	Node right;
	int nodeValue;

	/**
	 * @param left
	 * @param right
	 * @param nodeValue
	 */
	public Node(int nodeValue) {
		super();
		this.left = null;
		this.right = null;
		this.nodeValue = nodeValue;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * @return the nodeValue
	 */
	public int getnodeValue() {
		return nodeValue;
	}

	/**
	 * @param nodeValue
	 *            the nodeValue to set
	 */
	public void setnodeValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}

}
