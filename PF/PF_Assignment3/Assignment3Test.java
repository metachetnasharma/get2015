package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment3Test {
	Assignment3 ob=new Assignment3();
	int arr1[]=new int[]{2,86,8,97,10, 59, 77};
	int arr2[]=new int[]{};
	int expected1[]=new int[]{2,8,10,59,77,86,97};
	int expected2[]=new int[]{};
	{
	if(arr1.length>0)
	arr1=ob.quicksort(arr1, 0, arr1.length-1);
	if(arr2.length>0)
	arr2=ob.quicksort(arr2, 0, arr2.length-1);
	}
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
		 assertArrayEquals(expected1,arr1);
		 assertArrayEquals(expected2,arr2);
		
	}

}
