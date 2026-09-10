public class CheckPalindrome
{
	public static void main(String[]ar)
	{
		String pal = "madam";
		System.out.println("Palindrom or not: "+palindrome(pal));
	}
	public static Boolean palindrome(String pal)
	{
		char ch[] = pal.toCharArray();
		int s = 0;
		int e = ch.length-1;;
		while(s < e)
		{
			if(ch[s] != ch[e])
			{
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}