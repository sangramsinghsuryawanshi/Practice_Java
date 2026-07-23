public class SecondLargestEle
{
	public static String isLarge(int a[])
	{
		int max=Integer.MIN_VALUE;
		int sMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				sMax=max;
				max=a[i];
			}
			else if(a[i]>sMax && a[i]!=max)
			{
				sMax=a[i];
			}
		}
	return "Second Largest Element is --<> "+sMax;
		
	}
	public static void main(String[]ar)
	{
		int a[]={2,5,34,64,23,6};
		System.out.println(isLarge(a));
	}
}