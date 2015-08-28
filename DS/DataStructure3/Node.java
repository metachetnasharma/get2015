package DS3;

/**
 * @author Chetna
 *
 */
public class Node {
	int nodeValue;
	Node left;
	Node right;
 
	//constructor
	public Node() {
		left = null;
		right = null;
	}

	//constructor with arguement
	public Node(int nodeValue) {
		this.nodeValue = nodeValue;
		left = null;
		right = null;
	}
 
	//getter for node value
	public int getNodeValue() {
		return nodeValue;
	}

	//setter for node value
	public void setNodeValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}

	//getter for  left node
	public Node getLeft() {
		return left;
	}

	//setter for left node
	public void setLeft(Node left) {
		this.left = left;
	}

	//getter for right node
	public Node getRight() {
		return right;
	}

	//setter for right node
	public void setRight(Node right) {
		this.right = right;
	}

}
