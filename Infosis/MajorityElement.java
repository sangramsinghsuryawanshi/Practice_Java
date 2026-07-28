/*
169. Majority Element
Easy
Topics
premium lock icon
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
public class MajorityElement
{
	public static void main(String[]ar)
	{
		int a[] = {6,6,6,7,7};
		int counter=0;
		int ele=0;
		for(int n : a)
		{
			if(counter == 0)
			{
				ele = n;
			}
			if(ele == n)
			{
				counter++;
			}
			else{
				counter--;
			}
		}	
		System.out.println(ele+" ");
	}
}