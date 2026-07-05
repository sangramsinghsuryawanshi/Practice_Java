/*
Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
*/
import java.util.Scanner;
public class TripletOfNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("is Pythagorean triplet: "+isTriplet(a,b,c));
	}
	public static boolean isTriplet(int a, int b, int c)
	{
		return (squareNum(a) + squareNum(b)) == (squareNum(c));
	}
	public static int squareNum(int v)
	{
		return v*v;
	}
}