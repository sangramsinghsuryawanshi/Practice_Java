import java.util.*;
public class SmallestAndLargest
{
	public static String isChecked(int a[])
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
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
		
		return max+" <-max min-> "+min;

	}
	public static void main(String[]ar)
	{

		int a[]={23,4,465,5764,7,4};
		System.out.println("Given Array is: "+Arrays.toString(a));
		System.out.println(isChecked(a));
	}
}