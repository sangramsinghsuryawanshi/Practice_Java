import java.util.*;
class BinarySearch
{ 
	public static void isBS(int a[])
	{
		List<Integer> li = new ArrayList<>();
		for(int n:a)
		{
			li.add(n);
		}
		System.out.println(Collections.binarySearch(li,4));
	}
	public static void main(String[]af)
	{
		int a[]={0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		isBS(a);
	}
}
