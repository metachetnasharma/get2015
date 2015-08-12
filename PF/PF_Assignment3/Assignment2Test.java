package PF_Assignment4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Assignment2Test {
	Assignment2 permutation=new Assignment2();

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
		List<String> result;
		result=permutation.generatePermutations("", "ABC");
		List<String> output;
		output=new ArrayList<String>();
		output.add("ABC");
		output.add("ACB");
		output.add("BAC");
		output.add("BCA");
		output.add("CAB");
		output.add("CBA");
		
		assertEquals(result, output);
		result.clear();
		//fail("Not yet implemented");
	}
	@Test
	public void test1() {
		List<String> result1;
		result1=permutation.generatePermutations("","ABCD");
		System.out.println(">"+result1.size());
		
		for(String str:result1)
			System.out.println(">"+str);
		
		List<String> output1;
		output1=new ArrayList<String>();
		output1.add("ABCD");
		output1.add("ABDC");
		output1.add("ACBD");
		output1.add("ACDB");
		output1.add("ADBC");
		output1.add("ADCB");
		output1.add("BACD");
		output1.add("BADC");
		output1.add("BCAD");
		output1.add("BCDA");
		output1.add("BDAC");
		output1.add("BDCA");
		output1.add("CABD");
		output1.add("CADB");
		output1.add("CBAD");
		output1.add("CBDA");
		output1.add("CDAB");
		output1.add("CDBA");
		output1.add("DABC");
		output1.add("DACB");
		output1.add("DBAC");
		output1.add("DBCA");
		output1.add("DCAB");
		output1.add("DCBA");
		System.out.println(">"+output1.size());
		
	
		
		assertEquals(result1, output1);
		
		
		
		//fail("Not yet implemented");
	}


}
