/*
2. Prime Factorial Sum
Description: Calculate the sum of the factorial of all prime numbers up to a given integer n.
Input: A single integer n.
Output: An integer representing the sum.
Example:
Input:
Copy code
5
Output:
Copy code
128

*/
class PrimeFactorialSum
{
	public static void isPFS(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
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
				int f=1;
				for(int k=1;k<=i;k++)
				{
					f*=k;
				}
				sum+=f;
			}
		}
	System.out.println(sum);
	}
	public static void main(String[]ar)
	{
		int n=5;
		isPFS(n);
	}
}