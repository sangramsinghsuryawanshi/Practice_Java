/*
Question: Write a function to rotate an array to the right by a given number of steps.

Input: [1, 2, 3, 4, 5], k = 2
Output: [4, 5, 1, 2, 3]
*/
import java.util.*;
public class RotateArrayKthTime
{
	public static void isRAKT(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=2;i++)
		{
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		System.out.println(Arrays.toString(a));
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
		isRAKT(a);
	}
}
