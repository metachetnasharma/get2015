/*program for    1
 *              121
 *             12321
 *              121
 *               1
 */
package assignment8;
import java.util.Scanner;
public class Pattern1 
{
	//for whole pyramid
 public String pattern(int n)
 {
	 String str1="";
	 String str2="";
	 String str3="";
	 for(int row=1;row<=n;row++)
	 {
	 str1=Space(row,n);
	 str2=Numbers(row,n);
	 str3+=str1+str2+"\n";
	 
     }
	 for(int row=n-1;row>=1;row--)
	 {
	 str1=Space(row,n);    //str1 is for space
	 str2=Numbers(row,n);  //str2 is for numbers
	 str3+=str1+str2+"\n"; //str3 as a final string
	 
     }
	 return str3;
 } 
 //for space
 public String Space(int row,int n)
 {
	 String str="";
	 for(int i=row;i<n;i++)
	 {
		 str+=" ";
	 }
	 return str;
 }
 //for number pattern 
 public String Numbers(int row,int n)
 {
	 String str="";
	 int j=0;
	 for(int i=1;i<=row;i++)
	 {
		
			 str=str+i;
			 j++;
	 }
	 for(int i=j-1;i>=1;i--)
	 {
		 str=str+i;
	 }
	 
	 return str;
 }
 //main function
 public static void main(String args[])
 {
	 int n;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter n");
	 n=sc.nextInt();
	 Pattern1 p=new Pattern1();
	 String FullPattern=new String();
	 FullPattern=p.pattern(n);
	 System.out.print(FullPattern);
 
 sc.close();
 }
	

}
