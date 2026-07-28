public class CheckStringContainsOnlyNum
{
	public static String isDigit(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				return "Given String only Contains number";
			}
			else
			{
				return "Given String not Contains number";
			}
		}
		return "Something went wrong";
	}
	public static void main(String []ar)
	{
		String s="1";
		System.out.println("Given string is: "+s);
		System.out.println(isDigit(s));

	}

}