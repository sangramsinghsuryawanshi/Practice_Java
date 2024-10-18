interface A
{
	void hello();
}
interface B
{
	void hi();
}
class AchieveMultipleInhri implements A,B
{	
	public void hello()
	{
		System.out.println("Hello");
	}
	public void hi()
	{
		System.out.println("Hi");
	}
	public static void main(String[]ar)
	{
		AchieveMultipleInhri a = new AchieveMultipleInhri();
		a.hello();
		a.hi();
	}
}