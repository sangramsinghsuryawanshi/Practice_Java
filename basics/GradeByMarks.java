/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/
import java.util.Scanner;
public class GradeByMarks	
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int a = sc.nextInt();
		System.out.println("Grade is: "+isGrade(a));
	}
	public static String isGrade(int a)
	{
		if(a <= 100 && a >=91)
		{
			return "AA";
		}else if(a <= 90 && a>= 81){
			return "AB";
		}else if(a <= 80 && a>= 71){
			return "BB";
		}else if(a <= 70 && a>= 61){
			return "BC";
		}else if(a <= 60 && a>= 51){
			return "CD";
		}else if(a <= 50 && a>= 41){
			return "DD";
		}
		return "Fail";
	}
}