import java.util.*;
public class ThreadPrgramming extends Thread
{
	static int sum;
	public void run()
	{
		if(this.sum<=0)
		{
			int sum=0;
			for(int i=1;i<=5;i++)
			{
				sum+=i;
			}
		this.sum+=sum;
		System.out.println(sum+" if "+Thread.currentThread().getName());
		}
		else
		{
			int sum=0;
			for(int i=6;i<=10;i++)
			{
				sum+=i;
			}
		this.sum+=sum;
		System.out.println(sum+" else "+Thread.currentThread().getName());

		}
	}
	public static void main(String[]ar)
	{
		try{
			ThreadPrgramming t1 = new ThreadPrgramming();
			t1.start();
			t1.join();
			ThreadPrgramming t2 = new ThreadPrgramming();
			t2.start();
			t2.join();

			System.out.println(ThreadPrgramming.sum+" static sum");
		}catch(Exception e){

			e.printStackTrace();
		}
	}
}