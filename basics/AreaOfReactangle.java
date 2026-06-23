import java.util.Scanner;
public class AreaOfReactangle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth: ");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		float a = l * b;
		System.out.println("Area of reactangle: "+a);
	}
}	