/*
8. Tower of Hanoi
Problem Statement: Solve the Tower of Hanoi problem for n disks.
Input:
Number of disks n.
Output:
The sequence of moves needed to solve the problem.
Example:
Input: 3
Output:

Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
*/
import java.util.*;
public class TowerOfHanoi
{
	public static void isTOH(int n,char source,char destination,char auxiliary)
	{
		if(n==1)
		{
			 System.out.println("Move disk "+n+" from rod " + source + " to rod " + destination);
            return;
		}
		isTOH(n - 1, source, auxiliary, destination);
		System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);

              isTOH(n - 1, auxiliary, destination, source);
	}
	public static void main(String[]ar)
	{
		int n=3;
		isTOH(n,'A','C','B');
	}
}