/*
7. Reverse a Linked List
Problem Statement: Given a linked list, reverse the list.
Input:
Head of the linked list.
Output:
Reverse the linked list and return the new head.
Example:
Input: 1 -> 2 -> 3 -> 4 -> 5
Output: 5 -> 4 -> 3 -> 2 -> 1
*/
import java.util.*;
class ReverseLinkedList
{
	public static LinkedList<Integer> isRLL(LinkedList<Integer> li)
	{
		Collections.reverse(li);
		return li;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> li = new LinkedList<Integer>();
		int n=5;
			System.out.println("Enter Value: ");
		for(int i=1;i<=5;i++)
		{
			li.add(sc.nextInt());
		}
		System.out.println(isRLL(li));
	}
}
