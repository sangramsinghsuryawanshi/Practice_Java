/*
Question: Write a function to find the longest increasing subsequence in an array of integers.

Input: [10, 9, 2, 5, 3, 7, 101, 18]
Output: [2, 3, 7, 101] (or the length: 4)
*/
import java.util.*;
public class LongestIncresingSubsequence
{
	public static void isLIS(int a[])
	{
		List<Integer> li = new ArrayList<>();
		for(int i:a)
		{
			int mid=Collections.binarySearch(li,i);
			if(mid<0)
			{
				mid=-(mid+1);
			}
			if(mid<li.size())
			{
				li.set(mid,i);
			}
			else
			{
				li.add(i);
			}
		}
	System.out.println(li);
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given size: ");
		int p = sc.nextInt();
		int a[]=new int[p];
		System.out.println("Enter given element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		isLIS(a);
	}
}