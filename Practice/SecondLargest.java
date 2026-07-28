import java.util.*;
public class SecondLargest
{
	public static String isSeconLarge(int a[])
	{
		int smax=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			if(a[i]>smax && max!=a[i])
			{
				smax=a[i];
			}			
		}
		
		return smax+"<-Second max";

	}
	public static void main(String[]ar)
	{

		int a[]={23,465,465,5764,5764,4};
		System.out.println("Given Array is: "+Arrays.toString(a));
		System.out.println(isSeconLarge(a));
	}
}