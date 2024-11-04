/*
Remove duplicates from a sorted array

Input: Array: [1, 2, 2, 3, 4, 4, 5]
Remove duplicates from an unsorted array

Input: Array: [4, 3, 2, 4, 1, 3, 5]
*/
import java.util.*;
public class RemovedDuplicates
{
	public static void isRD(int a[])
	{
		List<Integer> li = new ArrayList<>();
		for(int n:a)
		{
			li.add(n);
		}
		for(int i=0;i<li.size();i++)
		{
			for(int j=i+1;j<li.size();j++)
			{
				if(li.get(i)==li.get(j))
				{
					li.remove(j);
				}
			}	
		}
	System.out.println(li);
	}
	public static void main(String[]ar)
	{
		int a[]={1, 2, 2, 3, 4, 4, 5};
		int b[]={4, 3, 2, 4, 1, 3, 5};
		isRD(a);
		isRD(b);
	}
}