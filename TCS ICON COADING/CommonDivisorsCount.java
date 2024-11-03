/*
9. Common Divisors Count
Description: Given two integers, count the number of divisors they have in common.
Input:
Line 1: Two integers a and b.
Output: An integer representing the count of common divisors.
Example:
Input:
Copy code
12 18
Output:
Copy code
4

*/
class CommonDivisorsCount
{
	public static void isCDC()
	{
		int a=12,b=18;
		int cnt=0;
		for(int i=1;i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				cnt++;
			}
		}		
	System.out.println(cnt);
	}
	public static void main(String[]ar)
	{
		isCDC();
	}
}