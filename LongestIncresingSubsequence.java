import java.util.*;
class LongestIncresingSubsequence
{
	public static void isLIS(int a[])
	{
		List<Integer> li = new ArrayList<>();
		for(int n:a)
		{
			int mid=Collections.binarySearch(li,n);
			if(mid<0)
			{
				mid=-(mid+1);
			}
			if(mid<li.size())
			{
				li.set(mid,n);
			}
			else
			{
				li.add(n);
			}
		}
		System.out.println(li.size()+" "+li);
	}
	public static void main(String[]ar)
	{
		int a[]={0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		isLIS(a);
	}
}