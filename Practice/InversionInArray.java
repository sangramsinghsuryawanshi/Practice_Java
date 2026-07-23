/*
2. Count Inversions in an Array
Count the number of inversions needed to sort the array. An inversion is when two elements are out of order.

Input: arr = [8, 4, 2, 1]
Output: 6 (inversions are (8,4), (8,2), (8,1), (4,2), (4,1), (2,1))
*/
import java.util.*;
class InversionInArray
{
	public static void isIIA(int a[])
	{
		int max=0;	
		List<Integer> li = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				li.add(a[i]);
				li.add(a[j]);
				max++;
			}
		}
	System.out.println("Length is: "+max);
	}
	public static void main(String []ar)
	{
		int a[]={8, 4, 2, 1};
		isIIA(a);
	}
}