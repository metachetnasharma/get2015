package PersonPackage;
import java.util.Scanner;
/**this class is for main class
 * @author chetna
 *
 */
public class UseStudent 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int uid,student_id;
		String name,Show;
		String course[]={"chemistry","Physics"};
		String showCourse[];
		System.out.println("enter uid");
		uid=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter student id");
		student_id=sc.nextInt();
		Person obj=new Student(uid,name,student_id);
		Show=obj.toString();
		System.out.println(Show);//to show name uid and student_id
		Student obj1=new Student(uid,name,student_id);
		obj1.setCourses(course);
		showCourse=obj1.getCourses();//to show courses
		for(int i=0;i<course.length;i++)
		{
			System.out.println(showCourse[i]);
		}
		sc.close();
	}

}
