/*
12. QUESTION – 12
You are given a function,
int findCount(int arr[], int length, int num, int diff);
The function accepts an integer array ‘arr’, its length and two integer
variables ‘num’ and ‘diff’. Implement this function to find and return
the number of elements of ‘arr’ having an absolute difference of less
than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference
with ‘num’ is less than or equal to ‘diff’, return -1.
Example:
Input:
arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3
Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to
‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.
*/
import java.util.*;
public class findCount
{
	public static int isfindCount(int n,int diff, int a[])
	{
		int acnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(Math.abs(n-a[i])<=diff)
			{
				acnt++;
			}
		}		
	return acnt;
	}
	public static void main(String[]ar)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n =sc.nextInt();
		System.out.println("Enter a difference: ");
		int diff =sc.nextInt();
		System.out.println("Enter Size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(isfindCount(n,diff, a));
	}
}