/*
9. Array Rotation
Problem Statement: Rotate an array of n elements to the right by k steps.
Input:
A list of integers and an integer k.
Output:
The rotated array.
Example:
Input: [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]
*/
import java.util.*;
class ArrayRotation
{
	public static void isRA(int a[],int k)
	{
		for(int i=0;i<=k;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[]ar)
	{
		int a[]={1, 2, 3, 4, 5, 6, 7};
		int k=3;
		isRA(a,k);
	}
}