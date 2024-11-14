/*
 28. Find the Count of Subarrays with Product Less Than K
    - Input: `[10, 5, 2, 6]`, `K = 100`
    - Output: `7`
 */
import java.util.*;
public class SubarrayProduct
{
	public static int isSPLK(int a[])
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int p=1;
				for(int k=i;k<=j;k++)
				{
					p*=a[k];
					System.out.print(a[k]+" "+p+" ");
				}
				System.out.println();
				if(p<100)
				{
					cnt++;
				}
			}
		}
	return cnt;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int p = sc.nextInt();
		int a[]=new int[p];
		System.out.println("Enter given number :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(isSPLK(a));	
	}
}