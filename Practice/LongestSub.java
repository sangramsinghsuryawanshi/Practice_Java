import java.util.*;
import java.io.*;
public class LongestSub 
{

	public static void isLongSub(int a[])
	{
		
		String str=""; int max=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
                                int cnt=0;int c=0; String strdata=" ";
				for(int k=i;k<=j-1;k++)
				{
					if(a[k]<a[k+1])
					{
                                             	cnt++; 
						strdata+=a[k]+" ";
                                        }	
					c++;				
				}
                           if(cnt>max && cnt==c)
			   {
				max=cnt;
				str=strdata;
			   }
			}
		}
		System.out.println(max);
		System.out.println(str);
	}
	public static void main(String[]ar)
	{
		int a[]={12, 12, 15, 9, 46, 58, 60, 62, 68, 19, 7, 9, 12};
		isLongSub(a);
	}
	
}