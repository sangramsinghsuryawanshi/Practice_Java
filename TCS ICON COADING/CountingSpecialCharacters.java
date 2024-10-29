/*
Here are some additional TCS NQT coding questions with their input and output examples, across various levels:

Level 1:
Counting Special Characters
Problem: Given a string, count the number of special characters (non-alphanumeric characters).
Input: Hello@World!123
Output: 2
Explanation: Only @ and ! are special characters.
*/
class CountingSpecialCharacters
{
	public static void isCSC(String s)
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i)))
			{
				cnt++;
			}
		}
	System.out.println(cnt);
	}
	public static void main(String[]ar)
	{
		String s="Hello@World!123 ,;!@#$aqS./?;[]ty";
		isCSC(s);
	}	
}