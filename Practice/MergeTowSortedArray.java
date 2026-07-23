import java.util.*;
public class MergeTowSortedArray
{
	public static int[] isMerged(int a[],int b[])
	{
		int x=0;		
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[x++]=a[i];	
		}
		for(int i=0;i<b.length;i++)
		{
			c[x++]=a[i];	
		}
		Arrays.sort(c);
	return c;
	}
	public static void main(String[]ar)
	{

		int a[]={23,465,465,5764,5764,4};
		int b[]={1,65,46,64,574};
		System.out.println(Arrays.toString(isMerged(a,b)));
	}
}