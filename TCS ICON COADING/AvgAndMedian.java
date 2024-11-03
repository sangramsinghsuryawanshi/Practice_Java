/*
Find the average of all elements in an array

Input: Array: [4, 8, 6, 2, 10]
Find the median of the given array

Input: Array: [1, 7, 5, 9, 3]
*/
import java.util.*;
public class AvgAndMedian
{
	public static void isAAM()
	{
		int a[]={4, 8, 6, 2, 10};
		int b[]={1, 7, 5, 9, 3,1};
		int sum=0,cnt=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			cnt++;	
		}
		System.out.println(sum+" "+cnt+" "+sum/cnt);
		Arrays.sort(b);
		int sm=0;
		if(b.length%2!=0)
		{
			for(int i=b.length/2;i<=b.length/2;i++)
			{
				System.out.println(b[i]+" ");		
			}
		}
		else
		{
			for(int i=b.length/2-1;i<=b.length/2;i++)
			{
				sm+=b[i];
				System.out.println(b[i]+" ");	
			}
		}
	System.out.println(sm/2+" "+Arrays.toString(b));
	}
	public static void main(String[]ar)
	{
		isAAM();
	}
}	

