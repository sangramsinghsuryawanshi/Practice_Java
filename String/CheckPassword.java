/*
Write a function CheckPassword(str) which will accept the string as an 
argument or parameter and validates the password. It will return 1 if 
the conditions are satisfied else it’ll return 0? 
The password is valid if it satisfies the below conditions: 

It should contain at least 4 characters. 
At least 1 numeric digit should be present. 
1 Capital letter should be there. 
Password should not contain space or slash. 
The starting character should not be a number.
*/
import java.util.*;
public class CheckPassword
{	
	public static int isCheckPassword(String pass)
	{
		int cntChar=0;
		int cntNum=0;
		int cntUppcase=0,cnt=0;
		if(Character.isDigit(pass.charAt(0)))
		{
			return 0;
		}
		for(int i=0;i<pass.length();i++)
		{
			if(Character.isUpperCase(pass.charAt(i)))
			{
				cntUppcase++;
			}
			else if(Character.isAlphabetic(pass.charAt(i)))
			{
				cntChar++;
			}
			else if(Character.isDigit(pass.charAt(i)))
			{
				cntNum++;
			}
			else
			{
				cnt++;
			}
		}
		if(cntChar>=4 && cntNum>=1 && cntUppcase>=1 && cnt==0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given Pass: ");
		String pass=sc.next();
		System.out.println(isCheckPassword(pass));
	}
}