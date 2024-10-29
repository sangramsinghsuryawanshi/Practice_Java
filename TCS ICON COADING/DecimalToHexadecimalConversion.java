/*
Decimal to Hexadecimal Conversion

Input: 255
Output: FF
*/
class DecimalToHexadecimalConversion
{
	public static void isDTHC(int n)
	{
		System.out.println(Integer.toHexString(n).toUpperCase());
	}
	public static void main(String[]ar)
	{
		int n=255;
		isDTHC(n);
	}
}