public class FibonacciSeries
{
	public static void main(String[]ar)
	{
		int n = 8;
		int a=0,b=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+",");
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}