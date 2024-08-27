//10. K’th Smallest/Largest Element in Unsorted Array

//Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
//Output: 7
import java.util.*;
public class KthLargestNumber{
public static void main(String[]ar){
	int a[]={7, 10, 4, 3, 20, 15};
	int k=3;
	Arrays.sort(a);
	for(int i=0;i<a.length;i++){
		if((i+1)==k)
		{
			System.out.print(a[i]+" ");
		}	
	}
	}
}