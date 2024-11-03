/*
Find the Largest Number

Description: Given an array, find the largest number.
Input:
Line 1: Integer n, the number of elements.
Line 2: n space-separated integers.
Output: The largest integer in the array.
Example:
Input:
Copy code
4
2 8 1 6
Output:
Copy code
8
*/
public class FindLargestNumber
{
	public static void isFLN()
	{
		int a[]={2,8,1,6};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
	System.out.println(max);
	}
	public static void main(String[]ar)
	{
		isFLN();
	}
}