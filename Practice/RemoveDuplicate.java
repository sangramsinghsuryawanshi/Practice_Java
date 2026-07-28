import java.util.*;
public class RemoveDuplicate
{
	public static void isRemoved(int a[])
	{
		System.out.println("Removed Dulicates: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}	
			}	
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}	
		}
	}
	public static void main(String[]ar)
	{

		int a[]={23,4,465,4,7,4};
		System.out.println("Given Array is: "+Arrays.toString(a));
		isRemoved(a);
	}
}