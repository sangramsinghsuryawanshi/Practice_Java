/*
Find the missing number in an array

Input: Array: [1, 2, 4, 5] (for numbers 1 to 5)
*/
import java.util.*;
class MissingNumber
{
	public static void isMS()
	{
		int a[]={1, 2, 4, 5};
		int sum=0;
		int f=a[0],l=a[a.length-1],s=a.length+1;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
	int t=s*(f+l)/2;
	System.out.println(t-sum);
	}
	public static void main(String[]ar)
	{
		isMS();
	}
}