import java.util.*;
public class FibonacciSeriesUpton
{
	public static void isFibonaci(int n)
	{
		int a=0,b=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;			
		}
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number");
		int n=sc.nextInt();
		isFibonaci(n);
	}
}