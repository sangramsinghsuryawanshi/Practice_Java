public class CharacterFreq
{
	public static void main(String[]ar)
	{
		String s = "sangramsingh";
		frequency(s);
	}
	public static void frequency(String s)
	{
		boolean b[] = new boolean[s.length()];
		for(int i=0;i<s.length();i++)
		{
			int cnt=1;
			if(b[i])continue;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					b[j] = true;
					cnt++;
				} 
			}
			System.out.println(s.charAt(i)+" : "+cnt);
		}
	}
}