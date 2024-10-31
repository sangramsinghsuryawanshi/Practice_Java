/*
5. Smallest Subarray With Given Sum
Description: Given an array and a target sum, find the length of the smallest subarray with a sum greater than or equal to the target.
Input:
Line 1: Integer n (number of elements).
Line 2: A space-separated list of integers.
Line 3: Integer target.
Output: Integer representing the length.
Example:
Input:
Copy code
4
1 4 2 3
6
Output:
Copy code
2
*/
class SmallestSubarraySum
{
	public static void isSSS()
	{
		int a[]={1,4,2,3};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{	
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				StringBuilder sb = new StringBuilder();
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					sb.append(a[k]);
				}
				if(sum==6)
				{
					if(sb.length()>max)
					{
						max=sb.length();
					}
				}
			}
		}
	System.out.println(max);	
	}
	public static void main(String[]ar)
	{
		isSSS();
	}
}