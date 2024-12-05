/*
4. Find Maximum In An Array
Write a function FindMaxInArray, which will find the greatest number
from an array with its desired index? The greatest number and its
desired index should be printed in separate lines.
Sample Test Case:
Input:
10
15 78 96 17 20 65 14 36 18 20
Output:
96
2 
*/
import java.util.*;
public class FindMaxInArray
{
	public static String isFindMaxInArray(int a[])
	{
		int max=Integer.MIN_VALUE;
		int ind=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				ind=i;
			}
		}
	return max+" \n"+ind;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(isFindMaxInArray(a));
	}
}