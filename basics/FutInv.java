/**
Future Investment Value
FV=PV×(1+r)^n

Where:

FV = Future Value
PV = Present Value (initial investment)
r = Annual interest rate (in decimal)
n = Number of years
*/

import java.util.Scanner;
public class FutInv
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Present value: ");
		double pv = sc.nextDouble();
		System.out.println("Enter Annual interest rate: ");
		double r = sc.nextDouble();
		System.out.println("Enter number of yers: ");
		int n = sc.nextInt();	

		double fv = pv * Math.pow((1 + r),n);
		System.out.println("Future Value: "+fv);
	}
}