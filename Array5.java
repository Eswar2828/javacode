import java.util.Scanner;
import java.io.*;
class Array5 
{
	public static void main(String[] args) 
	{
		int[][][]a=new int[3][][];
		a[0]=new int[3][];
		a[1]=new int[2][];
		a[2]=new int[2][];
		a[0][0]=new int[5];
		a[0][1]=new int[3];
		a[0][2]=new int[2];
		a[1][0]=new int[2];
		a[1][1]=new int[3];
		a[2][0]=new int[4];
		a[2][1]=new int[2];
		a[2][2]=new int[1];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
				System.out.println("enter the marks of school"+i+"class"+j+"student"+k);
				a[i][j][k]=s.nextInt();
				}
			}
		}
		System.out.println("marks of the students");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
				System.out.println(a[i][j][k]);
				}
			}
			System.out.println(" ");
		}	
	}
}
