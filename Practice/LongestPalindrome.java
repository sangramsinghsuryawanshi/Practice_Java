public class LongestPalindrome
{
	public static void isChecklp(String str)
	{
		int max=Integer.MIN_VALUE;
		String ls="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				String s=str.substring(i,j);
				StringBuilder sb = new StringBuilder(s);					sb.reverse();
				if(sb.toString().equals(s))
				{
					if(s.length()>max)
					{
						max=s.length();
						ls=s;
					}
				}
			}			
		}
	System.out.println("length of Longest palindrome Substring is: "+max);
	System.out.println("substring is: "+ls);
	}
	public static void main(String []ar)
	{
		String s="GEEKSFORGEEKS";
		System.out.println("Given string is: "+s);
		isChecklp(s);

	}

}