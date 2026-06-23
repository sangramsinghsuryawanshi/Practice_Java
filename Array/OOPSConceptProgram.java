import java.util.Scanner;
abstract class A1{
	private String name;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	abstract void isVoid();
	
	public int isOverride(int a){
		System.out.println("class a overloading method: "+a);
		return 0;
	} 
	public int isOverload(int a, int b){
		System.out.println("class a overload method: "+a+b);
		return 0;
	} 
}
class B1 extends A1{
	public static int isOverride(int a, int b){
		System.out.println("class b overloading method: "+a+b);
		return 0;
	}
	public int isOverload1(int a,int b){
		System.out.println("class b overload method: "+a+b);
		return 0;
	}
	public void isVoid(){
		System.out.println("abstract method is overload: ");
	} 
}
public class OOPSConceptProgram{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value: ");
		int a = sc.nextInt();
		System.out.println("enter b value: ");
		int b = sc.nextInt();
		System.out.println("enter name: ");
		sc.nextLine();
		String name = sc.nextLine();
		B1 b1 = new B1();
		b1.setName(name);
		System.out.println(b1.getName());
		b1.isOverride(a,b);
		b1.isOverload1(a,b);
	}
}