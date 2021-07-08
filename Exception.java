import java.util.*;
class Exception 
{
	public static void main(String[] args) 
	{
		System.out.println("connection starts at exception");
		Scanner scan=new Scanner(System.in);
		try
		{
		System.out.println("enter the num");
		int a=scan.nextInt();
		System.out.println("enter the den");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("enter the non zero values");
		}
		System.out.println("connection ends at exception");
	}
}
