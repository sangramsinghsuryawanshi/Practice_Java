import java.util.*;
public class RotateArray
{
	public static void isRotate (int a[],int k)
	{
		System.out.println("Rotates: ");
		for(int i=1;i<=k;i++)
		{
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];	
			}	
			a[0]=temp;
		System.out.println(Arrays.toString(a));	
		}
	}
	public static void main(String[]ar)
	{

		int a[]={23,4,465,4,7,4};
		int k=3;
		System.out.println("Given Array is: "+Arrays.toString(a));
		isRotate(a,k);
	}
}