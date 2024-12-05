/*9. Replace Character
Write a function Replacecharacter(Char str1, Char ch1, Int 1, Char ch2)
which has a string(str) and the two characters ch1 and ch2. Execute a
function in such a way that string str will return to its original string,
and all the events in ch1 are replaced by ch2 and vice versa?
Consider: The strings will have only alphabets in lower case.
Sample Test Case:
Input:
str: tervpro
ch1: e
ch2: p
Output:
tprvero
Solution:
All the ‘e’s in the string are replaced with the ‘p’ and ‘p’ is replaced with
the ‘e’. 
*/
import java.util.*;
public class Replacecharacter
{	
	public static String isReplacecharacter(String pass,char c1, char c2)
	{
		char temp='\0';
		pass=pass.replace(c1,temp);
		pass=pass.replace(c2,c1);
		pass=pass.replace(temp,c2);
		return pass;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given Pass: ");
		String pass=sc.next();
		System.out.println("Enter two Char: ");
		char c1=sc.next().charAt(0);
		char c2=sc.next().charAt(0);
		System.out.println(isReplacecharacter(pass,c1,c2));
	}
}