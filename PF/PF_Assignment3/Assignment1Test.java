package recursion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment1Test {

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
		Assignment1 obj=new Assignment1();
		int remainder=obj.rem(2,1);
		assertEquals("",remainder,0);
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		Assignment1 obj=new Assignment1();
		int remainder=obj.rem(2,0);
		assertEquals("",remainder,-1);
		//fail("Not yet implemented");
	}
	@Test
	public void test3() {
		Assignment1 obj=new Assignment1();
		int remainder=obj.rem(100,3);
		assertEquals("",remainder,1);
		//fail("Not yet implemented");
	}
	@Test
	public void test4() {
		Assignment1 obj1=new Assignment1();
		int gcdValue=obj1.gcd(2,1);
		assertEquals("",gcdValue,1);
		//fail("Not yet implemented");
	}
	@Test
	public void test5() {
		Assignment1 obj1=new Assignment1();
		int gcdValue=obj1.gcd(100,3);
		assertEquals("",gcdValue,1);
		//fail("Not yet implemented");
	}
	@Test
	public void test6() {
		Assignment1 obj1=new Assignment1();
		int gcdValue=obj1.gcd(30,40);
		assertEquals("",gcdValue,10);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test7() {
		Assignment1 obj2=new Assignment1();
		int largestdigit=obj2.largestDigit(2);
		assertEquals("",largestdigit,2);
		//fail("Not yet implemented");
	}
	@Test
	public void test8() {
		Assignment1 obj2=new Assignment1();
		int largestdigit=obj2.largestDigit(1257369);
		assertEquals("",largestdigit,9);
		//fail("Not yet implemented");
	}
	@Test
	public void test9() {
		Assignment1 obj2=new Assignment1();
		int largestdigit=obj2.largestDigit(444);
		assertEquals("",largestdigit,4);
		//fail("Not yet implemented");
	}

}
