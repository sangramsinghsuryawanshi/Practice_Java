/*
13. DECODE
N-base notation is a system for writing numbers that uses only n
different symbols, This symbols are the first n symbols from the given
notation list(Including the symbol for o) Decimal to n base notation are
(0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A,11:B and so on upto
35:Z).
Implement the following function
*char DectoNBase(int n, int num):**
The function accept positive integer n and num Implement the function
to calculate the n-base equivalent of num and return the same as a
string
Steps:
Divide the decimal number by n,Treat the division as the integer
division
Write the the remainder (in n-base notation)
Divide the quotient again by n, Treat the division as integer division
Repeat step 2 and 3 until the quotient is 0
The n-base value is the sequence of the remainders from last to firstAssumption:
1 < n < = 36 
Example
Input
n: 12
num: 718
Output
4BA
Explanation
num = 718, divisor = 12, quotient=59, remainder=10(A).
num = 59, divisor = 12, quotient=4, remainder=11(B).
num = 4, divisor = 12, quotient=0, remainder=4(A).
Sample Input
n: 21
num: 5678
Sample Output
CI8 
*/
import java.util.*;
public class DectoNBase
{
	public static String isDectoNBase(int n,int num)
	{
		String base="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if(n<2 || n>36)
		{
			throw new IllegalArgumentException("Base must be between 2 and 36");
		}
		if(num==0)
		{
			return "0";
		}
		StringBuilder sb =new StringBuilder();
		while(num!=0)
		{
			int reminder = num%n;
			sb.append(base.charAt(reminder));
			 num /= n;
		}
	return sb.reverse().toString();
	}
	public static void main(String[]ar)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 value: ");
		int n1 =sc.nextInt();
		System.out.println("Enter num: ");
		int num =sc.nextInt();
		System.out.println(isDectoNBase(n1,num));
	}
}
