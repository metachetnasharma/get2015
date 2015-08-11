package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment2Test {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assignment2 obj=new Assignment2();
		int a[]=new int[]{2,5,8,9,10, 77, 55,71,51,45};
	    int  element=obj.LinearSearch(a,88);
	    assertEquals(0,element);
		//fail("Not yet implemented");
	}
	@Test
	public void test1() {
		Assignment2 obj1=new Assignment2();
		int a[]=new int[]{2,5,8,9,10, 77, 55,71,51,45};
	    int  element1=obj1.LinearSearch(a,77);
	    assertEquals(1,element1);
	    
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		Assignment2 obj2=new Assignment2();
		int a[]=new int[]{2,5,8,9,10,15,30,45,55,77};
	    int element1=obj2.BinarySearch(a,30,a.length-1,0);
	    assertEquals(1,element1);
	    
		//fail("Not yet implemented");
	}
	@Test
	public void test3() {
		Assignment2 obj3=new Assignment2();
		int a[]=new int[]{2,5,8,9,10,15,30,45, 55, 77};
	    int element1=obj3.BinarySearch(a,80,a.length-1,0);
	    assertEquals(0,element1);
	    
		//fail("Not yet implemented");
	}

}
