/*
Input:
An array of integers arr[] of size n.
Output:
Length of the longest increasing subsequence.
Example 1:
Input: [10, 22, 9, 33, 21, 50, 41, 60, 80]
Output: 6
Explanation: The longest increasing subsequence is [10, 22, 33, 50, 60, 80], which has a length of 6.
*/
import java.util.*;
class LongIncresingSubsequence
{
	public static int isLIS(int a[])
	{
		List<Integer> li = new ArrayList<>();
		for(int num:a)
		{
			int mid=Collections.binarySearch(li,num);
			if(mid<0)
			{
				mid=-(mid+1);
			}			
			if(mid<li.size())
			{
				li.set(mid,num);
			}
			else
			{
				li.add(num);
			}
		}
		System.out.println(li);
		return li.size();		
	}
	public static void main(String[]ar)
	{
		int a[]={10, 22, 9, 33, 21, 50, 41, 60, 80};
		System.out.println(isLIS(a));
	}
}