public class LargestAndSmallest
{
	public static String isSmallAndLarge(int a[])
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
	return max+" <>-- Largest Element Smallest Element --<> "+min;
		
	}
	public static void main(String[]ar)
	{
		int a[]={2,5,34,64,23,6};
		System.out.println(isSmallAndLarge(a));
	}
}