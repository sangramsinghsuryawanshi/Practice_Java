/*
Find all symmetric pairs in an array

Input: Array of pairs: [(1, 2), (3, 4), (2, 1), (4, 3)]
*/
import java.util.*;
public class SymmetricPairs
{
	public static void isSP(int a[][])
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		List<List<Integer>> symmetricPairs = new ArrayList<>();
		for(int p[]:a)
		{
			int f=p[0];
			int s=p[1];			
			if(hm.containsKey(s) && hm.get(s)==f)
			{
				System.out.println("("+f+","+s+")");
				System.out.println("("+s+","+f+")");
				List<Integer> pair1 = new ArrayList<>();
              			pair1.add(f);
			        pair1.add(s);
		                symmetricPairs.add(pair1);
	
        		        List<Integer> pair2 = new ArrayList<>();
		                pair2.add(s);
                		pair2.add(f);
		                symmetricPairs.add(pair2);
				hm.remove(s);
			}
			else
			{
				hm.put(f,s);
			}
		}
	System.out.println(symmetricPairs);
	}
	public static void main(String[]ar)
	{
		int a[][]={{1, 2}, {3, 4}, {2, 1}, {4, 3}};
		isSP(a);
	}
}