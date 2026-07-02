/*
Java Program Vowel Or Consonant
*/
public class VowelCons
{
	public static void main(String[]ar)
	{
		char ch = 'a';
		VowelCons v = new VowelCons();
		boolean check = v.isVowel(ch);
		if(check)
		{
			System.out.println("Given character is vowel");
		}
		else
		{
			System.out.println("Given character is consonant");
		}
	}

	public boolean isVowel(char ch)
	{
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			return true;
		}
		return false;
	}
}