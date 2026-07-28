/*
5. Find Prime Numbers in a Range
Problem Statement: Given two integers a and b, print all prime numbers between a and b (inclusive).
Input:
Two integers a and b.
Output:
Prime numbers between a and b.
Example:
Input: 10, 20
Output: 11 13 17 19
*/
class PrimeNumRange
{
	public static void isPNS(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[]ar)
	{
		int a=10,b=20;
		isPNS(a,b);
	}
}