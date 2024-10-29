/*
Sum of Series 1 + 1/2 + 1/3 … + 1/n

Input: 5
Output: 2.283
*/
class SumSeries
{
	public static void isSS(int n)
	{
		double sum=0.0;
		for(int i=1;i<=n;i++)
		{
			sum+=1.0/i;
		}
		System.out.println(sum);
	}
	public static void main(String[]ar)
	{
		int n=5;
		isSS(n);
	}
}