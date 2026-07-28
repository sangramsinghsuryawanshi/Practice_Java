/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/
import java.util.Arrays;
public class RotateNArray
{
	public static void main(String[]ar)
	{
		int a[] = {1,2,3,4,5,6,7};
		int n = a.length;
		int k =3;
		k = k%n;
		reverse(a,0,n-1);
		reverse(a,0,k-1);
		reverse(a,k,n-1);
		System.out.println(Arrays.toString(a));
	}
	private static void reverse(int a[],int left,int right)
	{
		while(left < right)
		{
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
	}
}