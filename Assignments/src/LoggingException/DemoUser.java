package LoggingException;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * @author Chetna
 *
 */
public class DemoUser {
	
	private static Logger logger = Logger.getLogger(DemoUser.class);
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user[] = new User[2];
		
			try {
				for(int i = 0; i < 3; i++){
					user[i] = new User();
					System.out.println("Enter user "+(i+1)+" id");
				    try {
						user[i].setId(scanner.nextInt());
					} catch (Exception e) {
						logger.error("OOPS....having exception... ", e);
					}
				    System.out.println("Enter user "+(i+1)+" name");
				    try {
						user[i].setName(scanner.next());
					} catch (Exception e) {
						logger.error("OOPS....having exception... ", e);
					}
				    System.out.println("Enter user "+(i+1)+" address");
				    try {
						user[i].setAddress(scanner.next());
					} catch (Exception e) {
						logger.error("OOPS....having exception... ", e);
					}
				    System.out.println("Enter user "+(i+1)+" salary");
				    try {
						user[i].setSalary(scanner.nextInt());
					} catch (Exception e) {
						logger.error("OOPS....having exception... ", e);
					}
				}
			} catch (Exception e) {
				logger.error("OOPS....having exception... ", e);
			}
		
		for(int i = 0; i < 2; i++){
			System.out.println("User "+ i+ " information: "+user[i]);
		}
		
	}

}
