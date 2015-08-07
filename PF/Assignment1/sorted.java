package assignment6;
	import java.util.*;
	public class sorted {
		
		public static void main(String args[])
		{
			sorted one=new sorted();
			Scanner sc=new Scanner(System.in);
			int[] array=new int[10];
			System.out.println("Enter Elements of Array: ");
			for(int i=0;i<10;i++)
			{
				array[i]=sc.nextInt();
			}
			int result;
			result=one.checkSorted(array);
			System.out.println(result);
		}
		
		public int checkSorted(int input[])
		{
			int j;
			int count1=0, count2=0;
			for(int i=0;i<input.length-1;)
			{
				j=i+1;
				if(input[i]<input[j])
				{
					count1++;
				}
				else
				{
					count2++;
				}
				i++;
			}
			if(count1==input.length-1)
				return 1;
			else if(count2==input.length-1)
				return 2;
			else
				return 0;
		}

	}



