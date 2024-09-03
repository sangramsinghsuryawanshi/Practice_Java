public class CheckPrime
{
	public static String isPrime(int a)
	{
		int cnt=0;		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				cnt++;
			}		
		}
		if(cnt==2)
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
		int a=3;
		System.out.println(isPrime(a));
	}
}