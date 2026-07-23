public class CheckStringContainsVowelsAndConsonet
{
	public static void isCheckVC(String str)
	{
		char ch[]=str.toCharArray();
		int vcnt=0,ccnt=0;
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				vcnt++;
			}
			else
			{
				ccnt++;
			}
		}
		System.out.println("Count of Vowels is: "+vcnt);
		System.out.println("Count of Consonent is: "+ccnt);
	}
	public static void main(String []ar)
	{
		String s="programming";
		System.out.println("Given string is: "+s);
		isCheckVC(s);

	}

}