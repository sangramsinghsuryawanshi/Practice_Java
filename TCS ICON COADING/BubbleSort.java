/*
Sort elements in an array (Bubble sort)

Input: Array: [4, 2, 7, 1, 3]
*/
import java.util.*;
class BubbleSort
{
	public static void isBS()
	{
		int a[]={4, 2, 7, 1, 3};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int te=a[j];
					a[j]=a[j+1];
					a[j+1]=te;
				}
			}
		}
	System.out.println(Arrays.toString(a));
	}
	public static void main(String[]ar)
	{
		isBS();
	}
}