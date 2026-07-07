/*
Build Array from Permutation
Problem Statement

You are given a 0-indexed array nums.

The array is a permutation of numbers from 0 to n - 1.

You need to create a new array ans such that:

ans[i] = nums[nums[i]]

Return the new array.

What is a Permutation?

A permutation means:

Every number from 0 to n-1 appears exactly once.
No duplicates.
No missing numbers.
*/
import java.util.Arrays;
public class buildArray
{
	public static void main(String[] ar) {
        int a[] = {2, 3, 1, 4, 4};
        int ans[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = a[a[i]];
        }
        int ans1[] = new int[a.length];
        System.out.println(System.nanoTime() + " " + Arrays.toString(ans));
	long start = System.nanoTime();

	int result = per(ans1, a, 0);

	long end = System.nanoTime();
        System.out.println(result+" "+Arrays.toString(ans1));
	System.out.println("Execution Time: " + (end - start) + " ns");
    }

    public static int per(int[] ans, int[] nums, int i) {
        if (nums.length == i) return 0;
        
	ans[i] = nums[nums[i]];
        return per(ans, nums, i + 1);
    }
}