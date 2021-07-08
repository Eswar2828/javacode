class Count 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			t=s.charAt(i)+t;
		}
		if(s.equals(t))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
