/*
Question 5: Check if Array is Sorted
Requirements
Determine whether the array is sorted in ascending order.
Input
5
10 20 30 40 50
Output
Array is Sorted
*/
import java.util.Scanner;
import java.util.Arrays;
public class ArrayIsSortedOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		System.out.println("Enter array of element: ");
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean isSorted = true;
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length-1 && a[i] > a[i+1])
			{
				isSorted = false;
			}
		}
		if (isSorted) 
		{
            		System.out.println("Array is Sorted");
        	} 
		else 
		{
            		System.out.println("Array is Not Sorted");
        	}
	}
}