import java.util.*;
import java.io.*;
public class MinuteHour
{

	public static int isAngle(int hr, int min)
	{
		int angle=0;
		int hour = (hr*30) + (int)(min*0.5);
		int minutes =  min*(6) ;
		int ans = Math.abs(hour-minutes);
		if(ans>180)
		{
			return 360-ans;
		}
		return ans;
	}
	public static void main(String[]ar)
	{
		int hr=9;
		int m=30;
		System.out.println(isAngle(hr,m));
	}
	
}