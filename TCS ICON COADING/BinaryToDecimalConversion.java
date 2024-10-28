/*
Binary to Decimal Conversion

Input: 1010
Output: 10
*/
class BinaryToDecimalConversion
{
	public static void isBTDC(int a)
	{
		int decimal=0;
		int base=1;
		while(a!=0)
		{
			int d=a%10;
			decimal+=d*base;
			base=base*2;
			a=a/10;
		}
		System.out.println(decimal);
	}
	public static void main(String[]ar)
	{
		int a=1001;
		isBTDC(a);
	}	
}