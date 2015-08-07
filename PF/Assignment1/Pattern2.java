/*this program is for pattern 54321
                               4321
                                321
                                 21
                                  1
 
 */
package assignment7;
import java.util.Scanner;
public class Pattern2 
{
	//for final pattern
	public String pattern(int n)
	{
		String Str1="";
		String Str2="";
		String Str3="";
		for(int row=1;row<=n;row++)
		{
			Str1=Space(row,n);
			Str2=Numbers(row,n);
			
			Str3+=Str1+Str2+"\n";
		}
		return Str3;
	}
	//for space
	public String Space(int row,int n)
	{
		int i=0;
		String str="";
		for(i=row;i>1;i--)
		{ 
			
			str+=" ";
			
		}
		return str;
	}
	//for number pattern
	public String Numbers(int row,int n)
	{
		int i=0;;
		String str="";
		for(i=1;i<=n-row+1;i++)
			{
			str+=i;
			}
		return str;
	}
	//for main function
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n;
		String str=new String();
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		Pattern2 p= new Pattern2() ;
		str=p.pattern(n);
		System.out.println(str);
		sc.close();
	}

}
