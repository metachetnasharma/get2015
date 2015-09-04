package DS8;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class MainClassOfTreeTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		String output = "";
		AscendingSeriesUsingTreeSort treeSort = new AscendingSeriesUsingTreeSort();
		treeSort.insert(32);
		treeSort.insert(6);
		treeSort.insert(8);
		treeSort.insert(12);
		treeSort.insert(5);
		treeSort.insert(3);
		treeSort.insert(1);
		treeSort.insert(15);
		treeSort.insert(2);
		output = treeSort.inorderTraversal();
		String expected = "123568121532";
		assertEquals("", expected, output);

	}

	@Test
	public void test1() {
		String output = "";
		AscendingSeriesUsingTreeSort treeSort = new AscendingSeriesUsingTreeSort();
		treeSort.insert(1);
		treeSort.insert(1);
		treeSort.insert(1);
		treeSort.insert(1);
		output = treeSort.inorderTraversal();
		String expected = "1";
		assertEquals("", expected, output);

	}

}
