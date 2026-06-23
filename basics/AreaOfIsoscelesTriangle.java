import java.util.Scanner;
public class AreaOfIsoscelesTriangle
{
	public static void main(String []ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height: ");
		float b = sc.nextFloat();
		float h = sc.nextFloat();	
		float a = (b*h)/2;
		System.out.println("Area of Isosceles Triangle: "+a);
	}
}