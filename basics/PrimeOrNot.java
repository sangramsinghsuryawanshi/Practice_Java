/*
Define a method to find out if a number is prime or not.
*/
import java.util.Scanner;
public class PrimeOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		isPrimeOrNot(a);
	}
	public static void isPrimeOrNot(int a)
	{
		int cnt=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i == 0)
			{
				cnt++;
			}
		}
		if(cnt == 2)
		{
			System.out.println("Number is prime");
		}else{
			System.out.println("Number is not prime");
		}
	}
}