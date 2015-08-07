package assignment8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pattern1Test {

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
		Pattern1 p=new Pattern1();
		String out= p.pattern(3);
		String str="  1\n 121\n12321\n 121\n  1\n";
		assertEquals("",  str  ,out); 
				          
				           
		//fail("Not yet implemented");
	}

}
