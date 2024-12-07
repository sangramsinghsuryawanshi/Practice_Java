/*
15. MATHS IS FUN
You are required to implement the following function:
int Calculate(int m, int n);
www.telegram.me/aptitudehemanth
The function accepts 2 positive integers ‘m’ and ‘n’ as its arguments.You
are required to calculate the sum of numbers divisible both by 3 and 5,
between ‘m’ and ‘n’ both inclusive and return the same.
Note
0 < m <= n
Example
Input:
m : 12
n : 50
Output
90
Explanation:
The numbers divisible by both 3 and 5, between 12 and 50 both
inclusive are {15, 30, 45} and their sum is 90.
Sample Input
m : 100
n : 160
Sample Output
510 
*/
import java.util.*;
public class MathsIsFun
{
	public static int isCalculate(int n1,int n2)
	{	
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum+=i;
			}
		}
	return sum;
	}
	public static void main(String[]ar)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 value: ");
		int n1 =sc.nextInt();
		System.out.println("Enter n2 value: ");
		int n2 =sc.nextInt();
		System.out.println(isCalculate(n1,n2));
	}
}
