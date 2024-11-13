/*
Question: Write a function to find the maximum value in an array of integers.

Input: [4, 7, 2, 9, 1]
Output: 9
*/
import java.util.*;
public class FindMax
{
	public static int isFM(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
	return max;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given size: ");
		int p = sc.nextInt();
		int a[]=new int[p];
		System.out.println("Enter given element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given Max Number is: "+isFM(a));
	}
}
