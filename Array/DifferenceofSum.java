/*
6. Difference Of Sum
Write a function differenceofSum(a,b) which will take two integers as
an argument. You’ve to obtain the total of all the integers ranging from
1 to n (both inclusive) that are not divisible by b. You should also return
the distinction between the sum of the integers which are not divisible
by b with the sum of the integers divisible by b?
Consider: a and b are greater than 0. i.e a>0 and b>0. And their sum
should lies between the integral range.
Sample Test Case 1:
Input:
a = 6 and b = 30
Output:
285
Explanation:
The integers that are divisible by 6 are 6, 12, 18, 24, and 30 and their
sum is 90. The integers that are not divisible by 6 are 1, 2, 3, 4, 5, 7, 8,
9, 10, 11, 13, 14, 15, 16, 17, 19, 20, 21, 22, 23, 25, 26, 27, 28 and 29.
And their addition is 375.
The difference between them is (375 – 90) = 285.
Sample Test Case 2:
Input:
a = 10
b = 3
Output:
19 
*/
import java.util.*;
public class DifferenceofSum
{
	public static int isDifferenceofSum(int a, int b)
	{
		int x=(a<b)? a:b;
		int y=(a>b)? a:b;
		int dsum=0,nDsum=0;
		for(int i=1;i<=y;i++)
		{
			if(i%x==0)
			{
				dsum+=i;
				
			}
			if(i%x!=0)
			{
				nDsum+=i;
			}
		}
		System.out.print(dsum+" "+nDsum);
		int max=(dsum>nDsum)? dsum:nDsum;
		int smax=(dsum<nDsum)? dsum:nDsum;
	return max-smax;
	}
	public static void main(String[]ar)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two values: ");
		int a =sc.nextInt();
		int b=sc.nextInt();
		System.out.println(isDifferenceofSum(a, b));
	}
}