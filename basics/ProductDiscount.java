/** Calculate Discount Of Product */
import java.util.Scanner;
public class ProductDiscount
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name: ");
		String proname = sc.next();
		System.out.println("Enter discount amount: ");
		double discount = sc.nextDouble();
		System.out.println("Enter product amount: ");
		double proAmt = sc.nextDouble();

		double discountAmt = (discount * proAmt) / 100;
		double finalAmt = proAmt - discountAmt;
		System.out.println("Discount amount "+proname+" is: "+ finalAmt);
	}
}