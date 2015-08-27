package DataStructure2;

//customised stack based on linked list
public class Stack {
  Node top;
  private int length;

  public Stack() {
	top = null;
	length = 0;
  }

  // push the value to stack
  public void push(Object object) {
	Node node = new Node(object);
	node.setNext(top);
	top = node;
	length++;
  }

  // to remove top node
  public Object pop() {
	if (top == null) // in case when stack is empty
	    return null;
	length--;
	Object itemObject = top.getData();
	top = top.getNext();
	return itemObject;
  }

  // check data of first element without popping
  public Object peek() {
	if (top == null) { // in case when stack is empty
	    return null;
	} else {
	    return top.getData();
	}
  }

  // to display all elements
  public void display() {
	Node temp = top;
	while (temp != null) {
	    System.out.println(temp.getData());
	    temp = temp.getNext();
	}
  }

  // will return no of elements in the stack
  public int size() {
	return length;
  }
}
