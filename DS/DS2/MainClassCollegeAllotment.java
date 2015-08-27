package DataStructure2;

import java.util.Scanner;

/**
 * @author Chetna
 *
 */
public class MainClassCollegeAllotment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CollegeAllotment college = new CollegeAllotment(5, 2);
		Queue student = new Queue(12);
		String collegeName[] = { "UDML", "PIET", "JECRC", "PGI", "GIT" };
		college.getCollegeData(collegeName);

		student.enqueue("Divya");
		student.enqueue("Richa");
		student.enqueue("Nitesh");
		student.enqueue("Nidhi");
		student.enqueue("Chetna");
		student.enqueue("Anjita");
		student.enqueue("Manish");
		student.enqueue("Aarti");
		student.enqueue("Rahul");
		student.enqueue("Renu");
		student.enqueue("Seema");
		student.enqueue("Gaurav");
		student.enqueue("Mayank");

		int i = 0, status = 1;

		while (i < student.queueArray.length && college.noOfallotedSeat != 10) {

			try {
				String studentName = student.getRear(i);

				System.out.println(studentName
						+ " choose college for councelling ");

				college.displayCollegelist();
				int collegeChoosen = sc.nextInt();

				status = college.allotSeat(studentName, collegeChoosen - 1);
				if (college.noOfallotedSeat != 10 && status == 0) {
					System.out.println(studentName
							+ " choose another college for councelling ");
					college.displayCollegelist();
					collegeChoosen = sc.nextInt();
					status = college.allotSeat(studentName, collegeChoosen - 1);
				}

				i++;
			} catch (Exception ex) {
				System.out.print("College not available");

			}
		}

		college.displayAlotmentList();
		sc.close();
	}

}
