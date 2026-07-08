/*
Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/
import java.util.Scanner;
import java.util.Arrays;
public class ReachestCustomer
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and column: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int wealth[][] = new int[row][col];
		System.out.println("Enter values: ");
		for(int i=0;i<wealth.length;i++)
		{
			for(int j=0;j<wealth[i].length;j++)
			{
				wealth[i][j] = sc.nextInt();
			}
		}
		System.out.println("Reachest Man wealth is: "+as(wealth));
	}
	public static int as(int[][] wealth)
	{
		int max=0;
		for(int i=0;i<wealth.length;i++)
		{
			int sum=0;
			for(int j=0;j<wealth[i].length;j++)
			{
				sum+=wealth[i][j];
			}
			if(sum > max)
			{
			max=sum;
			}
		}
		return max;
	}
}