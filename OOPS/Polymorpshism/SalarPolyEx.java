/*
Question 2: Employee Salary Calculator
Requirements
Parent class: Employee
Child classes:
FullTimeEmployee
PartTimeEmployee
Override calculateSalary().
Input
Full Time Salary = 50000

Part Time Hours = 40

Hourly Rate = 500
Output
Full Time Salary = 50000

Part Time Salary = 20000
*/
class Employee
{
	public void calculateSalary(double salary, int h,int rate)
	{
		System.out.println("class Employee");
	}
}
class FullTimeEmployee extends Employee
{
	public void calculateSalary(double salary, int h,int rate)
	{
		System.out.println("Full Time Salary: "+salary);
	}
}
class PartTimeEmployee extends Employee
{
	public void calculateSalary(double salary, int h,int rate)
	{
		System.out.println("Part Time Salary: "+(h*rate));
	}
}
public class SalarPolyEx
{
	public static void main(String[]ar)
	{
		Employee full = new FullTimeEmployee();
		full.calculateSalary(50000.00,40,50);

		Employee part = new PartTimeEmployee();
		part.calculateSalary(50000.00,40,50);
	}
}