/*
Find Sum of Cubes of Digits

Input: 153
Output: 153
*/
class SumOfCubes
{
	public static int isSOC()
	{
		int n=153;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int p=rem*rem*rem;
			sum+=p;
		n/=10;
		}
	return sum;
	}
	public static void main(String[]ar)
	{
		System.out.println("Sum of cube: "+isSOC());
	}
}