/*
Rotate an array by K elements - Block Swap Algorithm

Input: Array: [1, 2, 3, 4, 5], K: 2
*/
import java.util.*;
public class BlockSwapAlgorithm
{
	public static void isSBA()
	{
		int a[]={1, 2, 3, 4, 5};
		int k=2;
		for(int i=1;i<=k;i++)
		{
			int t=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=t;
		}
	System.out.println(Arrays.toString(a));
	}
	public static void main(String[]ar)
	{
		isSBA();
	}
}	

