package assignment4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergeSortTest {

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
		MergeSort m=new MergeSort();
		int a[]=new int[]{2,3,5,7};
		int b[]=new int[]{3,4,6};
		int c[]=new int[a.length+b.length];
		int e[]=new int[]{2,3,3,4,5,6,7};
		int out[]=m. join(a, a.length, b,b.length,c);
		//fail("Not yet implemented");
	}

}
