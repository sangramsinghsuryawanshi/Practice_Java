import java.util.*;
public class LinkedListClass
{
	public static void isA()
	{
		List<String> l1 = new LinkedList<>();
		l1.add("sangram");
		Iterator<String> i1 = l1.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
	}
	public static void main(String[]ar)
	{
		isA();
	}
}