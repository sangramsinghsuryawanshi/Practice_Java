public class ReverseString
{
	public static String isReverse(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		 str=sb.toString();
		return str;
	}
	public static void main(String []ar)
	{
		String s="Hello";
		System.out.println("Given string is: "+s);
		System.out.println("Reverse string is: "+isReverse(s));

	}

}