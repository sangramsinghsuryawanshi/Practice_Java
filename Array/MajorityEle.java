/*
Question: Write a function to find the majority element in an array. (An element that appears more than n/2 times, where n is the length of the array.)

Input: [3, 3, 4, 2, 3, 3, 3]
Output: 3
*/
import java.util.*;
public class MajorityEle
{
	public static void isME(int a[])
	{
		int c=a.length;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=-1;
				}
			}
			if(cnt>c/2 && a[i]!=-1)
			{
				System.out.println(a[i]+" ");
			}
		}
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
		isME(a);
	}
}