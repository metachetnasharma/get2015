package assignment6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class sortedTest {

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
		sorted obj=new sorted();
		int out=obj.checkSorted(new int[] {1,2,3,4,5,6,7,8,9,10});
		assertEquals("for ascending order",1,out);
		
		//fail("Not yet implemented");
	}
	@Test
	public void test1() {
		sorted obj=new sorted();
		int out=obj.checkSorted(new int[] {10,9,8,7,6,5,4,3,2,1});
		assertEquals("for descending order",2,out);
		
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		sorted obj=new sorted();
		int out=obj.checkSorted(new int[] {1,2,3,5,6,7,8,5,9,10});
		assertEquals("for non sorted order",0,out);
		
		//fail("Not yet implemented");
	}

}
