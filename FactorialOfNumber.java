/*
11. Factorial of a Number
Problem Statement: Find the factorial of a number.
Input:
A single integer n.
Output:
Factorial of n.
Example:
Input: 5
Output: 120
*/
import java.util.*;
class FactorialOfNumber
{
	public static void isFON(int a)
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f*=i;
		}
		System.out.println(f);
	}
	public static void main(String[]ar)
	{
		int a=5;
		isFON(a);
	}
}