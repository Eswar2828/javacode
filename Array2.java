import java.util.Scanner;
import java.io.*;
class Array2
{
	public static void main(String[] args) 
	{
		int[][]a=new int[1][5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
					System.out.println("enter the marks of the classes"+i+"students"+j);
					a[i][j]=s.nextInt();
			}
		}
		System.out.println("marks of the students");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
					System.out.println(a[i][j]);
			}
			 System.out.println(" ");
		}
	}
}
