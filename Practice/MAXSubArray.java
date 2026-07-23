/*
6. Maximum Subarray Sum (Kadane's Algorithm)
Problem Statement: Find the maximum sum of a contiguous subarray in a given array of integers.
Input:
A list of integers.
Output:
The maximum sum of the contiguous subarray.
Example:
Input: [-2,1,-3,4,-1,2,1,-5,4]
Output: 6 (subarray [4,-1,2,1] has the maximum sum)
*/
class MAXSubArray
{
	public static int isMS(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					if(sum>max)
					{
						max=sum;
					}
				}
			}
		}
	return max;
	}
	public static void main(String[]ar)
	{
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(isMS(a));
	}
}