package DS1;

public class MainClassArrayList {
	public static void main(String args[])
	{
		ArrayList object=new ArrayList(5);
		object.addElement(2);
		object.addElement(3);
		object.addElement(8);
		object.addElement("v");
		object.addElement("sharma");
		object.addElement("chetna");
	         System.out.println("items in arrylist are");
		object.display();
		object.retrievingPosition("s");
		object.addElementAtPosition(5,"divya");
		System.out.println("after adding divya items in arrylist are");
		object.display();
		object.retrievingPosition("s");
		object.removeAtIndex(7);
		System.out.println("after removing item at given index items in arrylist are");
		object.display();
		object.removeItem(2);
		System.out.println("after removing item  items in arrylist are");
		object.display();
		System.out.println("reverse array list is");
		object.reverseArrayList();
		object.display();
		ArrayList object1=new ArrayList(2);//adding new list in list 1
		object1.addElement("v");
		object1.addElement("a");
		object1.addElement("anjita");
		object1.addElement("s");
		object.addList(object, object1);
		System.out.println("after adding second list in first list");
		object.display();
		object.clearList();
	}

}
