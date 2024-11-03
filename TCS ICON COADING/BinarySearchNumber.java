/*
Search the element in an array (Linear search, Binary search)

Input: Array: [1, 3, 5, 7, 9], Target: 5
*/
import java.util.*;
class BinarySearchNumber
{	
	public static int isBS()
	{
		int a[]={1,3,5,7,9};
		int t=5;
		List<Integer> li = new ArrayList<>();
		for(int n:a)
		{
			li.add(n);
		}
		int s=Collections.binarySearch(li,t);
		if(s>=0)
		{
			return s;
		}
		else
		{
			return -1;
		}
	}
	public static void main(String[]ar)
	{
		System.out.println(isBS());
	}
}