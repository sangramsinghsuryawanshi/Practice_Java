public class PrintLongestSubstringLenghtNonRep
{
	public static void isCheckVC(String str)
	{
		int max=Integer.MIN_VALUE;
		String ls="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				String s1=str.substring(i,j);
				int cnt=0;
				for(int k=0;k<s1.length();k++)
				{
					
					for(int l=k+1;l<s1.length();l++)
					{
						if(s1.charAt(k)==s1.charAt(l))
						{
							cnt++;
							break;
						}
					}
				}
				if(s1.length()>max && cnt==0)
				{
					max=s1.length();
					ls=s1;
				}
			}			
		}
	System.out.println("length of Longest Nonrepeating Substring is: "+max);
	System.out.println("substring is: "+ls);
	}
	public static void main(String []ar)
	{
		String s="programminglanguage";
		System.out.println("Given string is: "+s);
		isCheckVC(s);

	}

}