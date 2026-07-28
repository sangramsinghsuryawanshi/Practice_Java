/*
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
*/
public class LargestSumOfSubArray
{
	public static void main(String[]ar)
	{
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};
		int b[] = {1};
		int c[] = {5,4,-1,7,8};
		int maxA = maxSubArray(a);
		int maxB = maxSubArray(b);
		int maxC = maxSubArray(c);
		System.out.println("a: "+maxA+", b: "+maxB+", c: "+maxC);
	}
	private static int maxSubArray(int a[])
	{
		int max = a[0];
		int sum=0;
		for(int num : a)
		{
			sum+=num;
			max = Math.max(sum,max);
			if(sum < 0)
			{
				sum=0;
			}
		}
		return max;
	}
}