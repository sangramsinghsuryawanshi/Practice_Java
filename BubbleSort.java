import java.util.*;
public class BubbleSort
{
	public static int[] isSort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		int a[]={23,4,465,5764,7,4};
		System.out.println("Given Array is: "+Arrays.toString(a));
		System.out.println("Sorted Array is: "+Arrays.toString(isSort(a)));
	}
}