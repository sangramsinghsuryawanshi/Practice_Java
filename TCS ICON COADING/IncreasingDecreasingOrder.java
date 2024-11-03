/*
Rearrange the array in increasing-decreasing order

Input: Array: [8, 3, 1, 5, 2]
Resulting Array: [1, 2, 3, 8, 5]
*/
import java.util.*;
public class IncreasingDecreasingOrder
{
	public static void isIDO()
	{
		int a[]={2,4,6,8, 3, 1, 5, 2};
		Arrays.sort(a);
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=i+1;j<a.length/2;j++)
			{
				if(a[i]>a[j])
				{
					int te=a[i];
					a[i]=a[j];
					a[j]=te;
				}
			}
		}
		for(int i=a.length/2;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int te=a[i];
					a[i]=a[j];
					a[j]=te;
				}
			}
		}
	System.out.println(Arrays.toString(a));
	}
	public static void main(String[]ar)
	{
		isIDO();
	}
}	

