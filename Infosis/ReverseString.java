public class ReverseString
{
	public static void main(String[]ar)
	{
		String s ="Hello";
		System.out.println("Reversing String: "+swap(s));
	}
	public static String swap(String s)
	{
		int start = 0;
		int end = s.length()-1;
		char ch[] = s.toCharArray();
		while(start < end)
		{
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		return new String(ch);
	}
}