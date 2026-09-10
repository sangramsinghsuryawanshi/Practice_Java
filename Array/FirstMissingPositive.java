/*
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
*/
import java.util.Arrays;
public class FirstMissingPositive
{
	public static void main(String[]ar)
	{
		int a[] = {1,2,0};
		int b[] = {3,4,-1,1};
		int c[] = {7,8,9,11,12};
		System.out.println(Arrays.toString(sort(a)));
		System.out.println(Arrays.toString(sort(b)));
		System.out.println(Arrays.toString(sort(c)));
	}
	private static int[] sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}