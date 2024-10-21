/*
10. Find the Missing Number
Problem Statement: Given an array containing n-1 distinct numbers from 1 to n, find the missing number.
Input:
A list of integers of size n-1.
Output:
The missing number.
Example:
Input: [1, 2, 4, 6, 3, 7, 8]
Output: 5
*/
import java.util.*;
class FindMissingNumber
{
	public static void isFMN(int a[])
	{
		int sum=0;
		int f=a[0],l=a[a.length-1],le=a.length+1;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int to=le*(f+l)/2;
		System.out.println(to+" "+sum);
		System.out.println(to-sum);
	}
	public static void main(String[]ar)
	{
		int a[]={1, 2, 4, 6, 3, 7, 8};
		isFMN(a);
	}
}