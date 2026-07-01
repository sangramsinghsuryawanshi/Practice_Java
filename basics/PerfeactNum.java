/**
Perfect Number In Java
*/
import java.util.Scanner;
public class PerfeactNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int p = sc.nextInt();
		int sum=0;
		for(int i=1;i<p;i++)
		{
			if(p%i==0)
			{
				sum+=i;
			}
		}
		if(sum==p)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not perfect number");
		}
	}
}