package DS7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainBinaryClassTest {

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
		BinarySearch object = new BinarySearch();
		int a[]=new int[]{2,5,8,9,10,15,30,45,55,77};
	    int element1=object.leftOccurrenceOfElement(2, 0, a);
	    assertEquals(0,element1);
	}
	
	@Test
	public void test1() {
		BinarySearch object = new BinarySearch();
		int a[]=new int[]{2,5,8,9,10,15,30,45,55,77};
	    int element1=object.binarySearch(5,0,a.length-1,a);
	    assertEquals(1,element1);
	}
	
	@Test
	public void test2() {
		BinarySearch object = new BinarySearch();
		int a[]=new int[]{2,5,8,9,10,15,30,45,55,77};
	    int element1=object.binarySearch(1,0,a.length-1,a);
	    assertEquals(-1,element1);
	}

}
