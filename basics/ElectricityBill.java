/** Calculate Electricity Bil */
import java.util.Scanner;
public class ElectricityBill
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter previous reading and current reading: ");
		int pr = sc.nextInt();
		int cr = sc.nextInt();
		int rr = 8;
		int ar = pr-cr;
		int tot = ar*rr;
		System.out.println("Enter actual units: ");
		int units = sc.nextInt();
		System.out.println("Total cost is: "+tot+" And "+eleBill(units));
	}
	static int eleBill(int units)
	{
		int a = 100,b=200,c=250;
		if(units <=100)
		{
			return units * 5;
		}
		else if(units >100 && units <=200)
		{
			return units * 8;
		}
	return units * 10;
	}
}