/**
LCM Of Two Numbers
*/
import java.util.Scanner;
public class LCM
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a LCM size");
		int a=sc.nextInt();
		int b = sc.nextInt();
		int arr[] = new int[a];
		int brr[] = new int[b];
		int x=0,y=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				arr[x++] = i;	
			} 
		}
		for(int i=1;i<=b;i++)
		{
			if(b%i==0)
			{
				brr[y++] = i;	
			} 
		}
	int max=0;
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if(arr[i]==brr[j] && arr[i] > max)
				{
					max = arr[i];
				}
			}
		}
	System.out.println(max);
	}
}