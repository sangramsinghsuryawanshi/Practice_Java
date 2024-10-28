/*
12. Binary Search
Problem Statement: Implement binary search to find if an element exists in a sorted array.
Input:
A sorted list of integers and a target value.
Output:
The index of the target value if found, otherwise -1.
Example:
Input: [1, 2, 3, 4, 5], target = 3
Output: 2
*/
import java.util.*;
class BinarySearchNum
{
	public static void isBSN(int a[],int t)
	{
		int low=0,high=a.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(a[mid]==t)
			{
				System.out.println(mid+":");
			}
			if(a[mid]>t)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
	}
	public static void main(String[]ar)
	{
		int a[]={1, 2, 3, 4, 5};
		int t=5;
		isBSN(a,t);
	}
}