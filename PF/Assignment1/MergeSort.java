package assignment4;

	public class MergeSort {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a=new int[5];
			int[] b=new int[5];
			MergeSort one=new MergeSort();
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("Enter elements of first sorted array: ");
			for(int i=0;i<5;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Enter elements of second sorted array: ");
			for(int i=0;i<5;i++)
			{
				b[i]=sc.nextInt();
			}
			int c[]=new int[10];
			c=one.join(a,5,b,5,c);
			System.out.println("Joined array is: ");
			for(int i=0;i<10;i++)
			{
				System.out.println(c[i]);
			}
			sc.close();
		}
		public int[] join(int a[], int asize, int b[],int bsize, int c[])
		{
			int k=0;
			for(int i=0;i<asize;)
			{
				for(int j=0;j<bsize;)
				{
					if(a[i]<b[j])
					{
						c[k]=a[i];
						i++;
						k++;
					}
					else
					{
						c[k]=b[j];
						j++;
						k++;
					}
					if(i==asize)
					{
						for(int count=k;count<asize+bsize;count++)
						{
							c[count]=b[j];
							j++;
						}
					}
					else if(j==bsize)
					{
						for(int count=k;count<asize+bsize;count++)
						{
							c[count]=a[i];
							i++;
						}
					}
				}
			}
			return c;
		}

	}



