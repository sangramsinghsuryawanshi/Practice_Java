/*
Find the equilibrium index of an array

Input: Array: [3, 1, 5, 2, 2]
*/
import java.util.*;
public class EquilibriumIndex
{
	public static void isEI(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int rsum=0,lsum=0;
			for(int k=0;k<i;k++)
			{
				lsum+=a[k];
			}
			for(int j=i+1;j<a.length;j++)
			{
				rsum+=a[j];
			}	
			if(lsum==rsum)
			{
				System.out.println(i+" "+a[i]);
			}		
		}		
	}
	public static void main(String[]ar)
	{
		int a[]={3, 1, 5, 2, 2};
		isEI(a);
	}
}