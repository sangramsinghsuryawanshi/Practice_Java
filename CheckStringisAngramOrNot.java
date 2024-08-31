import java.util.*;
public class CheckStringisAngramOrNot
{
	public static String isAnagram(String str, String str1)
	{
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String s = new String(ch);
		String s1 = new String(ch1);
		if(s.equals(s1))
		{
			return "Given String is Anagram";
		}
		else
		{
			return "Given String is not Anagram";
		}
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s=sc.next();
		System.out.println("Enter Second String: ");
		String s1=sc.next();
		System.out.println(isAnagram(s,s1));
	}
}