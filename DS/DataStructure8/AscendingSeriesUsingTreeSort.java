package DS8;
/**
 * a program to print disorderly provided role numbers of n students in
 * ascending series using tree sort
 * 
 * @author Chetna Sharma
 *
 */
public class AscendingSeriesUsingTreeSort {
	Node root;
	String str;
	
	

	public void insert(int data) {
		root = insert(root, data);
	}

	/**
	 * constructor
	 */
	public AscendingSeriesUsingTreeSort() {
		root=null;
		str="";
	}

	/**
	 * private function to insert element in tree
	 * 
	 * @param node
	 * @param data
	 * @return node
	 */
	private Node insert(Node node, int data) {

		if (node == null) {
			node = new Node(data);
		} else {
			if (data <node.getnodeValue()) {
				node.left = insert(node.left, data);
			} else if (data >node.getnodeValue()) {
				node.right = insert(node.right, data);
			}
		}
		return node;
	}

	public String inorderTraversal() {
		String string=inorderTraversal(root);
		return string;
	}

	/**
	 * private function for inorder
	 * 
	 * @param node
	 */
	private String inorderTraversal(Node node) {
		if (node == null) {
			return null;
		}
		inorderTraversal(node.left);
		System.out.println(node.nodeValue);
		str+=node.nodeValue;
		inorderTraversal(node.right);
		return str;
		
	}

}
