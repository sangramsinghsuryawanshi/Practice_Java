public class ThreadProgram extends Thread
{	
	static int s=0;
	public void run()
	{
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
			s++;
		}
		if(s<=5){
			s--;
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[]ar)
	{
		try{
			ThreadProgram t1 = new ThreadProgram();
			t1.start();
			
			ThreadProgram t2 = new ThreadProgram();
			t2.start();
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}