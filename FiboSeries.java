/*
4. Fibonacci Series
Problem Statement: Print the Fibonacci series up to n terms.
Input:
A single integer n (number of terms).
Output:
First n terms of the Fibonacci series.
Example:
Input: 5
Output: 0 1 1 2 3
*/
class FiboSeries
{
	public static void isFS(int n)
	{
		int a=0,b=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}
	public static void main(String []ar)
	{
		int n=5;
		isFS(n);
	}
}