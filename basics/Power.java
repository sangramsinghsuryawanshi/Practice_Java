/**
Power In Java

*/
import java.util.Scanner;
public class Power
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter power: ");
		double com = sc.nextDouble();
		double re = Math.pow(4,com);
		System.out.println("Commision: "+re);
	}
}