/*
8. Find All Missing Numbers in an Array
Given an array of size n, containing numbers from 1 to n, some numbers are missing. Find all missing numbers without extra space and in O(n) time.

Input: arr = [4, 3, 2, 7, 8, 2, 3, 1]
Output: [5, 6]
*/
import java.util.*;
class MissingArray
{
	public static void isMA(int a[])
	{
		int max=1;	
		TreeSet<Integer> li = new TreeSet<>();
		for(int b:a)
		{
			li.add(b);
		}
	System.out.println("Length is: "+li);
	}
	public static void main(String []ar)
	{
		int a[]={4, 3, 2, 7, 8, 2, 3, 1};
		Arrays.sort(a);
		isMA(a);
	}
}