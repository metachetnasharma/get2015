package charAtImplementation;

/**
 * @author Chetna
 *
 */
public class charAtImplementation {
	static String str = "Chetna Sharma";
	public static void main(String[] args) {
		char output = charAt(50);
		System.out.println(output);
	}

	public static char charAt(int index) {
		char arrayString[] = str.toCharArray();
		if(index < 0 || index > arrayString.length){
			throw new StringIndexOutOfBoundsException();
		}
		return arrayString[index] ;
	}

}
