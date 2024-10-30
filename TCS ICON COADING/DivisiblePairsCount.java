/*
1. Divisible Pairs Count
Description: Given an array of integers and an integer k, count the number of pairs (i, j) where i < j and the sum arr[i] + arr[j] is divisible by k.
Input:
Line 1: An integer n (number of elements).
Line 2: A space-separated list of integers.
Line 3: Integer k.
Output: An integer representing the count of valid pairs.
Example:
Input:
4
1 3 2 6
3
Output:
2
*/
class DivisiblePairsCount
{
	public static void isDPC(int a[])
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0)
			{
				cnt++;
			}
		}
	System.out.println(cnt);
	}
	public static void main(String[]ar)
	{
		int a[]={1,3,2,6};
		isDPC(a);
	}
}