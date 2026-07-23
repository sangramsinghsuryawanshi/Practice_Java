import java.util.*;
public class StringPalindrome
{
	public static String isStringPal(String str,String str1)
	{
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		str = new String(ch);
		str1 = new String(ch1);
		if(str.equals(str1))
		{
			return "Given String is palindrome";
		}
		else
		{
			return "Given String is not palindrome";
		}
		
	}
	public static void main(String[]ar)
	{
		String str="silent";
		String str1="listen";
		System.out.println(isStringPal(str,str1));
	}
}