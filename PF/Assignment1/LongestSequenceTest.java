package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LongestSequenceTest {

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
		LongestSequence l=new LongestSequence();
		int out[]=l.longestSequence(new int[]{1,2,3,4,3,4,5,6,7,8,9,10,11,12,13,5,6,7,9,5,9,8,6,7,9});
		assertArrayEquals(new int[]{3,4,5,6,7,8,9,10,11,12,13},out);
		
		//fail("Not yet implemented");
	}

}
