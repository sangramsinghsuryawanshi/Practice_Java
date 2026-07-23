import java.util.*;
public class CheckNumberisPrime
{
	public static String isPrime(int n)
	{
		int a=0,b=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				a++;
			}			
		}
		if(a==2)
		{
			return "Given number is prime";
		}
		else
		{
			return "Given number is not prime";
		}
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number");
		int n=sc.nextInt();
		System.out.println(isPrime(n));
	}
}