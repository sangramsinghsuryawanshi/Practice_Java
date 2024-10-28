class BinaryToDecimalConversionOptimize
{
	public static int isOPT(int a)
	{
		int de=0;
		int b=1;
		while(a!=0)	
		{
			int t=a%10;
			de+=t*b;
			b*=2;
			a/=10;
		}
	return de;
	}
	public static void main(String[]aer)
	{
		int a=101010;
		System.out.println(isOPT(a));
	}
}