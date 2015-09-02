package DS6;

import java.util.Comparator;

/**
 * @author Chetna Sharma
 *
 */
public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		return e1.getName().compareTo(e2.getName());
	}
	
	


}
