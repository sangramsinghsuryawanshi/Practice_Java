import java.util.*;
public class MoveEle{
	public static void main(String[]ar){
		int a[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int c[]=new int[a.length];
		int x=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
			c[x++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
			c[x++]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
}	