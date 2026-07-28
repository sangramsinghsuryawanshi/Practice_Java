public class PermutationOfString
{
	public static void isPerm(String str,String per)
	{
		if(str.length()==0)
		{
			System.out.println(per+" ");
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String newCha=str.substring(0,i)+str.substring(i+1);
			isPerm(newCha,per+ch);
		}
	}
	public static void main(String[]ar)
	{
		String str="ABC";
		isPerm(str,"");
	}	
}