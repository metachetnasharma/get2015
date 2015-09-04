package DS8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainClassSortTest {

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

	/**
	 * positive test case :- Radix sort
	 */
	@Test
	public void radixTest() {
		Sort radix = new Sort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17 };
		int answer[] = radix.radixSort(input);
		int expected[] = { 2, 13, 17, 71, 454, 710, 1222, 1520 };
		assertArrayEquals("correct", expected, answer);
	}

	/**
	 * negative test case :- Radix sort
	 */
	@Test
	public void radixTestNegative() {
		Sort radix = new Sort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17 };
		int answer[] = radix.radixSort(input);
		for (int i = 1; i < answer.length; i++) {
			if (answer[i - 1] > answer[i]) {
				fail("radix sort fails");
			}
		}
	}

	/**
	 * positive test case :- Counting sort
	 */
	@Test
	public void countingTest() {
		Sort counting = new Sort();
		int input[] = { 11, 3, 21, 11, 42, 21, 7, 3 };
		int answer[] = counting.countingSort(input);
		int expected[] = { 3, 3, 7, 11, 11, 21, 21, 42 };
		assertArrayEquals("correct", expected, answer);
	}

	/**
	 * negative test case :- Counting sort
	 */
	@Test
	public void countingTestNegative() {
		Sort counting = new Sort();
		int input[] = { 11, 3, 21, 11, 42, 21, 7, 3 };
		int answer[] = counting.countingSort(input);
		for (int i = 1; i < answer.length; i++) {
			if (answer[i - 1] > answer[i]) {
				fail("Counting sort fails");
			}
		}
	}

	/**
	 * positive test case :- bubble sort
	 */
	@Test
	public void bubbleTest() {
		Sort bubble = new Sort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17 };
		int answer[] = bubble.bubbleSort(input);
		int expected[] = { 2, 13, 17, 71, 454, 710, 1222, 1520 };
		assertArrayEquals("correct", expected, answer);
	}

	/**
	 * positive test case :- Quick sort
	 */
	@Test
	public void quickTest() {
		Sort quick = new Sort();
		int input[] = { 1222, 710, 2, 71, 1520, 454, 13, 17, 88, 25, 61, 43 };
		int answer[] = quick.quickSort(0, input.length - 1, input);
		int expected[] = { 2, 13, 17, 25, 43, 61, 71, 88, 454, 710, 1222, 1520 };
		assertArrayEquals("correct", expected, answer);
	}

}
