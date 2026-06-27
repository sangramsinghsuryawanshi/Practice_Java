/** Calculate Distance Between Two Points

d=(x2​−x1​)2+(y2​−y1​)2
​​
*/
import java.util.Scanner;
public class DisBetTwoPoints
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1,y1: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter x2,y2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double result = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.println("Distance: "+result);
	}
}