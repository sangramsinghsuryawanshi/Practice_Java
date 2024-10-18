interface A
{
	void hello();
}
interface B extends A
{
	void hello();
	abstract void hi();
}
class AchieveDimondProblem implements B
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
		AchieveDimondProblem a = new AchieveDimondProblem();
		a.hello();
		a.hi();
	}
}