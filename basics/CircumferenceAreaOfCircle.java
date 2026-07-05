/*
Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
2pi r
*/
import java.util.Scanner;
public class CircumferenceAreaOfCircle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius: ");
		int r = sc.nextInt();
		System.out.println("Product of two number is: "+areaOfCircle(r));
	}
	public static double areaOfCircle(int r)
	{
		return 2 * Math.PI * r;
	}
}