/*
Pattern Printing: 1, 12, 123, … up to n

Input: 5
Output:
yaml
Copy code
1
12
123
1234
12345
*/
CLASS PatternPrinting
{
	public static void isPP(int n)throws Exception
	{
		for(int i=1;i<=n;i++)
		{
			Thread.sleep(200);
			for(int j=1;j<=i;j++)
			{
				Thread.sleep(100);
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[]ar)throws Exception
	{
		int n=5;
		isPP(n);
	}
}