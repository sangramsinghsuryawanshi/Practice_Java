/*

3. Hard: Longest Increasing Subsequence
Problem: Given an array of integers, write a Java program to find the length of the longest increasing subsequence (LIS). 
A subsequence is a sequence that can be derived by deleting some or no elements from the array without changing the order of the remaining elements.

Input:

int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
Output:
Length of LIS: 5

*/

import java.util.*;
public class LongestIncreSub
{
	public static int isLTS(int a[])
	{
		int cnt=0;
		if(a[0]>0 && a[a.length-1]>0)
		{
			cnt=2;
		}
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i+1] && a[i]>a[i-1])
			{
				cnt++;
			}			
		}
		return cnt;		
	}
	public static void main(String[]ar)
	{
		int a[]={10, 22, 9, 33, 21, 50, 41, 60};
		System.out.println("Length of LTS: "+isLTS(a));
	}	
}