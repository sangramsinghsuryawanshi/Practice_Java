/*
8. Product Small Pair
Write a function Productsmallpair(sum, arr) which will accept the two
integers sum and arr. These two integers will be used to find the arr(j)
and arr(k) where k is not equal to j.arr(j) and arr(k). k != j.arr(j) and
arr(k) should be the smallest elements from the array.
Rules:
If the value of n<2 or empty, then return -1.
If these pairs are not found then return the value as 0.
You should make sure that all the values are between the range of
integers.
Sample Test Case 1:
Input:
sum: 9
arr: 5 4 2 3 9 1 7
Output:
2
Solution:
From the given array of integers, you’ve to select the two smallest
integers which are 1 and 2. The addition of these two numbers is (1 + 2
= 3) which is less than 9(3 < 9). And the product of these two is 2 (2 x 1
= 2) so, the output we get is 2.
Sample Test Case 2:
Input:
sum: 4
arr: 9 8 -7 3 9 3
Output:
-21 
*/
import java.util.*;
public class Productsmallpair
{
	public static int isProductsmallpair(int sum, int a[])
	{
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		if(a.length<2)
		{
			return -1;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && a[i]!=min)
			{
				smin=a[i];
			}
		}
		System.out.println(min-smin);
		if(min-smin<sum)
		{
			return min*smin;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[]ar)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int sum =sc.nextInt();
		System.out.println("Enter Size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(isProductsmallpair(sum, a));
	}
}