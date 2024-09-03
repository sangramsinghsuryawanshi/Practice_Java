public class FibonacciSeries
{
	public static String isFibonacci(int a)
	{
		int x=0,y=1,sum=0;
		String s="";		
		for(int i=1;i<=a;i++)
		{
			s+=x+" ";
			sum=x+y;
			x=y;
			y=sum;	
		}
		return s;		
	}
	public static void main(String[]ar)
	{
		int a=10;
		System.out.println(isFibonacci(a));
	}
}