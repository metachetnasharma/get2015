package DS3;

/**
 * @author Chetna
 *
 */
public class BinaryTree {

	Node root;
	Node binaryRoot;
	int i = 0;
	int size = 0;
	int preOrder[] = new int[10]; // array to store values of preorder
	int postOrder[] = new int[10];// array to store values of postorder

	public void insert(int data) {
		root = insert(root, data);
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
			if (data <= node.getNodeValue()) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return node;
	}

	public void inorderTraversal() {
		inorderTraversal(root);
	}

	/**
	 * private function for inorder
	 * 
	 * @param node
	 */
	private void inorderTraversal(Node node) {
		if (node == null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.println(node.nodeValue);
		inorderTraversal(node.right);
	}

	public void preorderTravarsal() {
		preorderTravarsal(root);
	}

	/**
	 * private function for preorder
	 * 
	 * @param node
	 */
	private void preorderTravarsal(Node node) {

		if (node == null) {
			return;
		}
		System.out.println(node.nodeValue);
		preOrder[i++] = node.nodeValue;
		size++;
		preorderTravarsal(node.left);
		preorderTravarsal(node.right);
	}

	public void postorderTravarsal() {
		postorderTravarsal(root);
	}

	/**
	 * private function for postorder
	 * 
	 * @param node
	 */
	private void postorderTravarsal(Node node) {
		if (node == null) {
			return;
		}
		postorderTravarsal(node.left);
		postorderTravarsal(node.right);
		System.out.println(node.nodeValue);
		postOrder[i++] = node.nodeValue;
	}

	public void insertImage(int data) {
		binaryRoot = insertImage(binaryRoot, data);
	}

	/**
	 * function to generate mirror image of tree
	 * 
	 * @param node
	 * @param data
	 * @return
	 */
	private Node insertImage(Node node, int data) {

		if (node == null) {
			node = new Node(data);
		} else {
			if (data <= node.getNodeValue()) {
				node.right = insertImage(node.right, data);

			} else {
				node.left = insertImage(node.left, data);
			}
		}
		return node;
	}

	public boolean checkMirrorImageCondition() {
		return checkMirrorImageCondition(root, binaryRoot);
	}

	/**
	 * function to check trees are image to each other or not if preorder of
	 * binary tree and post order of image tree are same then both trees will be
	 * mirror image to each other
	 * 
	 * @param node
	 * @param nodeImage
	 * @return
	 */
	private boolean checkMirrorImageCondition(Node node, Node nodeImage) {

		int flag = 0;
		int j = size - 1;
		for (int i = 0; i < size; i++) {
			if (preOrder[i] == postOrder[j]) {
				j--;
			} else {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			return true;

		return false;

	}

}
