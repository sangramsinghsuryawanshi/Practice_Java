/**
Calculate Batting Average
*/

import java.util.Scanner;
public class BattingAverage
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of runs Scored: ");
		int runs = sc.nextInt();
		System.out.println("Enter no of wickets down: ");
		int w = sc.nextInt();
		int avg = runs/w;
		System.out.println("Batting average: "+avg);
		sc.close();
	}
}