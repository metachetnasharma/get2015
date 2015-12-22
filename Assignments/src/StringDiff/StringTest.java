package StringDiff;

/**
 * @author Chetna
 *
 */
public class StringTest {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Chetna");
		for (int i = 0; i < 1000000; i++) {
			sb.append("Sharma");
		}
		System.out.println("Time taken by StringBuffer: "
				+ (System.currentTimeMillis() - startTime) + "ms");
		
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Chetna");
		for (int i = 0; i < 1000000; i++) {
			sb2.append("Sharma");
		}
		System.out.println("Time taken by StringBuilder: "
				+ (System.currentTimeMillis() - startTime) + "ms");
	}
}
