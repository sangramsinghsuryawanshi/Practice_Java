/*
Find the second smallest and second largest element in an array

Input: Array: [10, 20, 5, 8, 15]
*/
import java.util.*;
class SecondLargeAndSmall
{	
	public static String isSLAS()
	{
		int a[]={10, 20,20,15, 5, 8, 15};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int smax=Integer.MIN_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				smax=a[i];
			}
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && a[i]!=min)
			{
				smin=a[i];
			}	
		}
	return smax+" "+smin;
	}
	public static void main(String[]ar)
	{
		System.out.println(isSLAS());
	}
}