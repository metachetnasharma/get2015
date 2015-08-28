package DS3;

import java.util.Scanner;

/**
 * @author Chetna
 *
 */
public class BinaryMainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BinaryTree binaryTree = new BinaryTree();
		BinaryTree binaryImageTree = new BinaryTree();
        int dataOfTree;

		while (true) {

			System.out.println("Menu\n1. Create Binary Tree"
					+ "\n2. Create  binary tree to check image operation" + "\n3. Inorder Traversal"
					+ "\n4. Preorder Traversal" + "\n5. Post order Traversal"
					+ "\n6. Check Mirror image or not" + "\n7. Exit");
			System.out.println("Enter Your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter a value : ");
				dataOfTree = sc.nextInt();
				binaryTree.insert(dataOfTree);
				break;

			case 2:
				System.out.print("Enter a value : ");
				dataOfTree = sc.nextInt();
				binaryImageTree.insertImage(dataOfTree);
				break;

			case 3:
				binaryTree.inorderTraversal();
				break;

			case 4:
				binaryTree.preorderTravarsal();
				break;

			case 5:
				binaryTree.postorderTravarsal();
				break;

			case 6:
				boolean status = binaryTree.checkMirrorImageCondition();
				if (status) {
					System.out.println("Both trees are  Image to each other");
				} else {
					System.out
							.println("Both trees are not Image to each other");
				}
				break;

			case 7:
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}

}
