import java.util.*;
public class BubbleSorting
{
	public static int[] isBubbleSort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}			
		}
	return a;
		
	}
	public static void main(String[]ar)
	{
		int a[]={2,5,34,64,23,6};
		System.out.println(Arrays.toString(isBubbleSort(a)));
	}
}