/*
Question 4: Find the Second Largest Element
Requirements
Find the second largest element.
Do not sort the array.
Input
6
10 45 78 65 12 90
Output
Second Largest = 78
*/
import java.util.Scanner;
public class SecondLargestEle
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
		int sMax = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				sMax=max;
				max=a[i];
			}
			else if(a[i] > sMax && a[i]!=max)
			{
				sMax=a[i];
			}
		}
		System.out.println("Second Largest element is: "+sMax);
	}
}