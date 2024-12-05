/*Write a function CalculateBinaryOperations(str) that accepts the string
as an argument or parameter. The string should contains the binary
numbers with their operators OR, AND, and XOR?
A Means the AND Operation.
B Means the OR Operation.
C Means the XOR Operation.
By scanning the given string from left to right you’ve to calculate the
string and by taking one operator at a time then return the desired
output.
Conditions:
The priority of the operator is not required.
The length of the string is always Odd.
If the length of the string is null then return -1.
Sample Test Case:
www.telegram.me/aptitudehemanth
Input:
1C0C1C1A0B1
*/
import java.util.*;
public class CalculateBinaryOperations
{
	public static int isCalculateBinaryOperations(String s)
	{
		int result=Character.getNumericValue(s.charAt(0));
		for(int i=1;i<s.length();i+=2)
		{
			int next=Character.getNumericValue(s.charAt(i+1));
			if(s.charAt(i)=='A')
			{
				result&=next;
			}
			else if(s.charAt(i)=='B')
			{
				result|=next;
			}
			else if(s.charAt(i)=='C')
			{
				result^=next;
			}
		}
	return result;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int cnt=2;
		System.out.println("Enter odd input: ");
		do
		{
			String s = sc.next();
			if(s.length()%2==0)
			{
				System.out.println("You have chance remaining: "+--cnt);
			}
			else
			{
				System.out.println(isCalculateBinaryOperations(s));
				break;
			}
		}while(cnt>=0);
	}
}