package assignment7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pattern2Test {

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
		Pattern2 p= new Pattern2() ;
		String str=new String();
		str=p.pattern(5);
		String out=new String();
		out="12345\n 1234\n  123\n   12\n    1\n";
		assertEquals("",out,str);
		//fail("Not yet implemented");
	}

}
