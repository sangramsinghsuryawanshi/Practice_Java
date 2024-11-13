/*
Question: Write a function to merge two sorted arrays into a single sorted array.

Input: [1, 3, 5], [2, 4, 6]
Output: [1, 2, 3, 4, 5, 6]
*/
import java.util.*;
public class MergeSortedArray
{
	public static void isMSA(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			c[cnt++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[cnt++]=b[i];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
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
		int b[]=new int[p];
		System.out.println("Enter given element: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		isMSA(a,b);
	}
}