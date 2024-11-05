/*
Sort the elements of an array by frequency

Input: Array: [4, 5, 6, 5, 4, 6, 6]
*/
import java.util.*;
import java.util.Map.Entry;
public class SortFrequencyWise
{
	public static void isRD(int a[])
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i],hm.get(a[i])+1);
			}
			else
			{
				hm.put(a[i],1);
			}
		}
		int max=0;
		List<Entry<Integer,Integer>> en = new ArrayList<>(hm.entrySet());
		en.sort((a1,b1)->b1.getValue().compareTo(a1.getValue()));
		List<List<Integer>> sortedList = new ArrayList<>();
        	for (Entry<Integer, Integer> entry : en) 
		{
			List<Integer> l1 = new ArrayList<>();
            		int element = entry.getKey();
            		l1.add(element);
			l1.add(entry.getValue());
			sortedList.add(l1);
            		
        	}
	  System.out.println("Array sorted by frequency: " + sortedList);
	}
	public static void main(String[]ar)
	{
		int a[]={4, 5, 6, 5, 4, 6, 6};
		isRD(a);
	}
}