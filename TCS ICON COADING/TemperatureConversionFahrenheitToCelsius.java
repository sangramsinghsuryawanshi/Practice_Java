/*
Temperature Conversion (Fahrenheit to Celsius)

Input: 100.0
Output: 37.78
*/
class TemperatureConversionFahrenheitToCelsius
{
	public static void isTCFTC(double n)
	{
		double c=(n-32)*5/9;
		System.out.println(c);
	}
	public static void main(String[]ar)
	{
		double n=100.0;
		isTCFTC(n);
	}
}