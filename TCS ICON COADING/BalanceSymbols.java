/*
Balance Symbols
Problem: Given a string containing * and #, determine if the string is balanced, where balance means an equal number of * and #.
Input: ###***
Output: 0
Explanation: Since * and # counts are equal, the output is 0.
*/
class BalanceSymbols
{
	public static int isBS(String s)
	{
		int hcnt=0,scnt=0;
		for(char c:s.toCharArray())
		{
			if(c=='#')
			{
				hcnt++;
			}
			else if(c=='*')
			{
				scnt++;
			}
		}
	return hcnt==scnt ?1:0;
	}
	public static void main(String[]ar)
	{
		String s="##***";
		System.out.println(isBS(s));
	}
}