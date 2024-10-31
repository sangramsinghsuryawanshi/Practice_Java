/*
6. Special String Formation
Description: Form a string by alternately picking characters from two input strings. If one string is shorter, continue with the remaining characters of the other string.
Input:
Line 1: String s1.
Line 2: String s2.
Output: A single string.
Example:
Input:
Copy code
abc
xyz
Output:
Copy code
axbycz
*/
class SpecialStringFormation
{
	public static void isSSF()
	{
		String s="abc";
		String r="xyz";
		int cnt=0;
		StringBuilder sb = new StringBuilder();
		int l=s.length()+r.length();
		for(int i=0;i<l;i++)
		{
			if(i<s.length())
			{
				sb.append(s.charAt(i));
			}
			if(i<r.length())
			{
				sb.append(r.charAt(i));
			}
			
		}
		System.out.println(sb);
	}
	public static void main(String[]ar)
	{
		isSSF();
	}	
}