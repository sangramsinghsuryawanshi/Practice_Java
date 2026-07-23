public class ReverseStringEle
{
	public static String isReverse(String str)
	{
		String s="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			s+=ch[i];
		}
	return s;
		
	}
	public static void main(String[]ar)
	{
		String str="java";
		System.out.println(isReverse(str));
	}
}