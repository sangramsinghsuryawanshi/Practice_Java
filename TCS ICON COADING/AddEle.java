/*
Add an element in an array

Input: Array: [1, 2, 3, 4], Element to add: 5
*/
import java.util.*;
public class AddEle
{
	public static void isAE(int a[])
	{
		List<Integer> li = new ArrayList<>();
		for(int n:a)
		{
			li.add(n);
		}
		li.add(5);
	System.out.println(li);
	}
	public static void main(String[]ar)
	{
		int a[]={1, 2, 3, 4};
		isAE(a);
	}
}