/*
3. Sum of Digits
Problem Statement: Given an integer, find the sum of its digits.
Input:
An integer n.
Output:
Sum of the digits of the integer.
Example:
Input: 123
Output: 6 (1 + 2 + 3)
*/
class SumOfDigits
{
	public static int isSOD(int n)
	{
		int temp=n;
		int sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		return sum;
	}
	public static void main(String[]ar)
	{
		int n=123;
		System.out.println(isSOD(n));
	}
}