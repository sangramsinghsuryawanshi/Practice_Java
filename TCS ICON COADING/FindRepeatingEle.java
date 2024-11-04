/*
Find all repeating elements in an array

Input: Array: [4, 5, 6, 5, 7, 8, 4]
*/
import java.util.*;
public class FindRepeatingEle
{
	public static void isFRE(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1 && cnt>1)
			{
				System.out.println(a[i]+" ");
			}
		}		
	}
	public static void main(String[]ar)
	{
		int a[]={4, 5, 6, 5, 7, 8, 4};
		isFRE(a);
	}
}