/*

9. WAP to find the number of character occurence in the String --> Thinkitive (T-2 , i -3 ,etc)

*/
public class CharOccurence{
public static void main(String []ar){
	String str="Thinkitive";
	str=str.toLowerCase();
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		int cnt=1;
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				cnt++;
				ch[j]='0';
			}
		}
		if(ch[i]!='0' && ch[i]!=' ')
		{
			System.out.println(ch[i]+" "+cnt);
		}
	}
}
}