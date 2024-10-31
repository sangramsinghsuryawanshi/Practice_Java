/*
4. Perfect Subarray Sum
Description: Given an array, count the number of subarrays with a sum equal to a perfect square.
Input:
Line 1: Integer n (number of elements).
Line 2: A space-separated list of integers.
Output: An integer representing the count.
Example:
Input:
Copy code
3
1 4 2
Output:
2
*/
class PerfectSubarraySum
{
	public static void isPSS()
	{
		int a[]={1,4,2};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{	
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
				}
				for(int l=1;l<=sum;l++)
				{
					int sq=l*l;
					if(sum==sq)
					{
						cnt++;
					}
				}		
			}
		}
	System.out.println(cnt);
	}
	public static void main(String[]ar)
	{
		isPSS();
	}	
}