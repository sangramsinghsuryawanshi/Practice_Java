import java.util.*;

public class ChocolateDistribution {

    public static int findMinDifference(int a[], int m) {
     	if(m==0 || a.length==0 || a.length<m)
	{
		return -1;
	}
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
	for(int i=0;i+m-1<a.length;i++)
	{
		int diff=a[i+m-1]-a[i];
		if(diff<minDiff)
		{
			minDiff=diff;
		}
	}
        return minDiff;
    }
    public static void main(String[] ar) {
        int a[] = {7, 3, 2, 4, 9, 12, 56};
        int l = 3;

        int b[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        int c[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int n = 7;
  
        System.out.println("Test one: Minimum Difference is " + findMinDifference(a, l));
        System.out.println("Test two: Minimum Difference is " + findMinDifference(b, m));
        System.out.println("Test three: Minimum Difference is " + findMinDifference(c, n));
    }
}
