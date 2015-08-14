package MatrixPackage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Scanner;

public class MatrixTest {
	Matrix matrix=new Matrix(3,2);

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
	public void test() 
	{
	 int showMatrix[][]=new int[3][2];
	 int value;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter array elements");
	 for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				value=sc.nextInt();
				matrix.addElements(i,j,value);
			}
		}
	 showMatrix=matrix.show();
	 int expectedMatrix[][]=new int[][]{{1,2},{3,4},{5,6}};
	 assertArrayEquals( showMatrix,expectedMatrix);
		
		//fail("Not yet implemented");
	}
	@Test
	public void test1() 
	{
	 int showMatrix[][]=new int[2][3];
	 int value;
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter array elements");
	 for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				value=sc.nextInt();
				matrix.addElements(i,j,value);
			}
		}
	 showMatrix=matrix.show();
	 Matrix Transpose=matrix.MatrixTranspose();
	 int expectedMatrix[][]=new int[][]{{1,2,3},{4,5,6}};
	 assertArrayEquals( showMatrix,expectedMatrix);
		
		//fail("Not yet implemented");
	}

}
