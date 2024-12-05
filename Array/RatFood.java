/*
11. Question
The function accepts two positive integers ‘r’ and ‘unit’ and a positive
integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number
of rats present in an area, ‘unit’ is the amount of food each rat
consumes and each ith element of array ‘arr’ represents the amount of
food present in ‘i+1’ house number, where 0 <= i.
Note:
1.Return -1 if the array is null
2.Return 0 if the total amount of food from all houses is not sufficient
for all the rats.
3.Computed values lie within the integer range.
Example:
Input:
r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2
Output:
4
Explanation:
Total amount of food required for all rats = r unit
= 7 2 = 14.
The amount of food in 1st houses = 2+8+3+5 = 18. Since, the amount of
food in 1st 4 houses is sufficient for all the rats. Thus, output is 4. 
*/
import java.util.*;
public class RatFood
{
	public static int isRatFood(int r,int unit, int a[])
	{
		if(a==null)
		{
			return -1;
		}
		int sum=0;
		int p=r*unit;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(sum<=p)
			{
				sum+=a[i];
				cnt++;
			}
			if(sum>=p)
			{
				break;
			}
		}
	return cnt;
	}
	public static void main(String[]ar)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r value: ");
		int r =sc.nextInt();
		System.out.println("Enter unit: ");
		int unit =sc.nextInt();
		System.out.println("Enter Size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(isRatFood(r,unit, a));
	}
}
