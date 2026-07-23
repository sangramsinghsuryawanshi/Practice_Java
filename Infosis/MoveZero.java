/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*/
import java.util.Arrays;
public class MoveZero
{
	public static void main(String[]ar)
	{
		int a[] = {0,1,0,3,12};
		int b[] = {0};
		System.out.println(Arrays.toString(moveZero(a)));
		System.out.println(Arrays.toString(moveZero(b)));
	}
	private static int[] moveZero(int a[])
	{
		int left = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > 0)
			{
				int temp = a[left];
				a[left] = a[i];
				a[i]=temp;
				left++;
			}
		}
		return a;
	}
}