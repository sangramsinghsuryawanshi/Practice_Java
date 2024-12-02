/*1. Small Large Sum 
Write a function SmallLargeSum(array) which accepts the array as an argument or 
parameter, that performs the addition of the second largest element from the 
even location with the second largest element from an odd location? 
Rules: 
All the array elements are unique. 
If the length of the array is 3 or less than 3, then return 0. 
If Array is empty then return zero. 
Sample Test Case 1: 
Input: 
6 
3 2 1 7 5 4 
Output: 
7 
Explanation: The second largest element in the even locations (3, 1, 5) is 3. The 
second largest element in the odd locations (2, 7, 4) is 4. So the addition of 3 and 
4 is 7. So the answer is 7. 
Sample Test Case 2: 
Input: 
7 
4 0 7 9 6 4 2 
Output: 
10
*/
import java.util.*;
public class SmallLargeSum
{
	public static int isSLS(int a[])
	{
		int maxEven=Integer.MIN_VALUE;
		int smaxEven=Integer.MIN_VALUE;
		int maxOdd=Integer.MIN_VALUE;
		int smaxOdd=Integer.MIN_VALUE;
		if(a.length<=3)
		{
			return 0;
		} 
		else
		{
			for(int i=0;i<a.length;i++)
			{
				if(i%2==0 && a[i]>maxEven)
				{
					smaxEven=maxEven;
					maxEven=a[i];
				}
				else if(i%2==0 && a[i]>smaxEven && a[i]!=maxEven)
				{
					smaxEven=a[i];
				}
				if(i%2!=0 && a[i]>maxOdd)
				{
					smaxOdd=maxOdd;
					maxOdd=a[i];
				}
				else if(i%2!=0 && a[i]>smaxOdd && a[i]!=maxOdd)
				{
					smaxOdd=a[i];
				}

			}
		System.out.println(smaxOdd+" "+smaxEven);
		return smaxOdd+smaxEven;
		}
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter given Element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given Answer is: "+isSLS(a));
	}
}