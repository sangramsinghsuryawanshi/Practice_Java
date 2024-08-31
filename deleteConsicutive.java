import java.util.*;
public class deleteConsicutive
{
	public static int isCon(String str)
	{
		String s[]=str.split(" ");
		Stack<String> s1= new Stack<String>();
		s1.add(s[0]);
		for(int i=1;i<s.length;i++)
		{
			if(s1.peek().equals(s[i]))
			{
				s1.pop();
			}
			else
			{
				s1.push(s[i]);
			}
		}
		return s1.size();
	}
	public static void main(String[]ar)
	{
		String str="ab aa aa bcd ab";
		System.out.println(isCon(str));
	}
}