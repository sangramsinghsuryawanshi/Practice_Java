/*
7. Sum of Odd Indexed Numbers
Description: Calculate the sum of all elements at odd indices in a given list.
Input:
Line 1: Integer n (number of elements).
Line 2: A space-separated list of integers.
Output: An integer representing the sum.
Example:
Input:
Copy code
5
10 15 20 25 30
Output:
Copy code
40
*/
class SumOddIndexedNumbers
{
	public static void isSOIN()
	{
		int a[]={10,15,20,25,30};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				sum+=a[i];
			}
		}
	System.out.println(sum);
	}
	public static void main(String[]ar)
	{
		isSOIN();
	}
}