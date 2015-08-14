package MatrixPackage;
import java.util.Scanner;


/**Program of Matrix class
 * @author Chetna
 *
 */
public class Matrix {
	 int data[][];
	int noRow;
	 int noCol;
	
	
	/**Constructor of matrix class
	 * @param row
	 * @param col
	 */
	public Matrix(int row,int col)
	{
		this.noRow=row;
		this.noCol=col;
		data=new int [noRow][noCol];
	}
	
	
	/**a method to add value at specific position
	 * @param row
	 * @param col
	 * @param value that we want to add
	 */
	public  void addElements(int row,int col,int value)
	{
		this.data[row][col]=value;
		
	}
	
	
	/**a method to transpose a matrix
	 * @return object
	 */
	public Matrix MatrixTranspose()
	{
		Matrix m=new Matrix(noCol,noRow);
		for(int i=0;i<noRow;i++)
		{
			for(int j=0;j<noCol;j++)
			{
				m.data[j][i]=data[i][j];
				
			}
			
		}


		return m;
	}
	
	
	public int[][] show()
	{
		return data;
	}
	
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int value,noRow,noCol;
		System.out.println("Enter array no. of rows");
		noRow=sc.nextInt();
		System.out.println("Enter array no. of col");
		noCol=sc.nextInt();
		int showMatrix[][]=new int[noRow][noCol];
		System.out.println("Enter array elements");
		Matrix matrix=new Matrix(noRow,noCol);
		for(int i=0;i<noRow;i++)//To add elements in a matrix
		{
			for(int j=0;j<noCol;j++)
			{
				value=sc.nextInt();
				matrix.addElements(i,j,value);
			}
		}
		System.out.println("matrix is");
		showMatrix=matrix.show();//To show matrix
		for(int i=0;i<noRow;i++)
		{
			for(int j=0;j<noCol;j++)
			{
				System.out.print(showMatrix[i][j]);
				
			}
			System.out.print("\n");
		}
		
		
		
		System.out.println("Transpose of matrix is");
		Matrix Transpose=matrix.MatrixTranspose();
		for(int i=0;i<Transpose.data.length;i++)//To show transpose matrix
		{
			for(int j=0;j<Transpose.data[i].length;j++)
			{
				System.out.print(Transpose.data[i][j]);
				
			}
			System.out.print("\n");
		}
		sc.close();
		
	}

}
