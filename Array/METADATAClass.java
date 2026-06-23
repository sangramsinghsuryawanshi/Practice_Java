import java.util.Scanner;
public class METADATAClass
{
	public static void isFrequency(String name){
		char ch[] = name.toCharArray();
		for(int i=0;i<ch.length;i++){
			int  cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]){
					cnt++;
					ch[j]='0';
				}
			}
			if(ch[i]!=' ' && ch[i]!='0'){
				System.out.print(ch[i]+" "+cnt+" ");
			}
		}
		
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		isFrequency(name);
	}
}