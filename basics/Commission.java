/** 
Calculate Commission Percentage
Commission= (Commission Percentage/100)×Sales Amount
*/
import java.util.Scanner;
public class Commission
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter commission percentage: ");
		double com = sc.nextDouble();
		System.out.println("Enter sales amount: ");
		double amt = sc.nextDouble();
		double re = (com/100) * amt;
		System.out.println("Commision: "+re);
	}
}