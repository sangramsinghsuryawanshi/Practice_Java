/*
Question 1: Find the Maximum Element
Requirements
Read an integer array.
Find and print the largest element.
Input
5
10 20 5 45 30
*/
import java.util.Scanner;
public class MaxEle
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
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max element is: "+max);
	}
}