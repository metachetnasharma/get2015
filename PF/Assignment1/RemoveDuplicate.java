package assignment5;
	import java.util.Scanner;

	public class RemoveDuplicate {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int noOfElements;
			System.out.println("Enter No of Elements: ");
			noOfElements=sc.nextInt();
			int[] array=new int[noOfElements];
			System.out.println("Enter Elements of Array: ");
			for(int i=0;i<noOfElements;i++)
			{
				array[i]=sc.nextInt();
			}
			int[] distinctArray;
			RemoveDuplicate one=new RemoveDuplicate();
			distinctArray=one.removeDuplicate(array);
			for(int i=0;i<distinctArray.length;i++)
			{
				System.out.println(distinctArray[i]);
			}
			sc.close();
		}
		
		public int[] removeDuplicate(int input[])
		{
			int n=input.length-1;
			int i,j,k;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<=n;j++)
				{
					if(input[i]==input[j])
					{
						for(k=j;k<n;k++)
						{
							input[k]=input[k+1];
						}
						n--;
						j--;
					}
				}
			}
			int output[]=new int[n+1];
			for(i=0;i<=n;i++)
			{
				output[i]=input[i];
			}
			return output;
		
		}
	}



