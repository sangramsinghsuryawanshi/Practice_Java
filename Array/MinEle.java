/*
Question 2: Find the Minimum Element
Requirements
Read an integer array.
Find the smallest element.
Input
6
20 5 70 10 40 1
Output
Smallest Element = 1
*/
import java.util.Scanner;
public class MinEle
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
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Smallest Element is: "+min);
	}
}