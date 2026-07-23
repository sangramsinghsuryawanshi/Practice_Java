/*Q6.WAP to replace all negative value with its immediate left elements square. Means 
     arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
     Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]*/

import java.util.*;
public class ImmediateNeg
{
	public static int[] isSqu(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
		}
		return a;		
	}
	public static void main(String[]ar)
	{
		int a[]={12, 3, -19, 29, 5, -61, 44, 7, -9};
		System.out.println(Arrays.toString(isSqu(a)));
	}	
}