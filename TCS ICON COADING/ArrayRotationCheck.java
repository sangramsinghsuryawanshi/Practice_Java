/*
3. Array Rotation Check
Description: Check if an array can be rotated by any number of positions to match another array.
Input:
Line 1: Integer n (number of elements).
Line 2: A space-separated list of integers (first array).
Line 3: A space-separated list of integers (second array).
Input:
Copy code
5
1 2 3 4 5
3 4 5 1 2
Output:
objectivec
Copy code
YES
Output: YES or NO indicating if one array is a rotation of the other.
*/
import java.util.*;
public class ArrayRotationCheck
{
	public static void isARC()
	{
		int a[]={1,2,3,4,5};
		int b[]={3,4,5,1,2};
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	public static void main(String[]ar)
	{
		isARC();
	}
}