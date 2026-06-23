class Message extends Exception
{
	public Message(String mge){
		super(mge);
	}
}
public class CustomClassException
{
	public static void isError() throws Message
	{
		for(int i=0;;i++)
		{
			if(i>10){
				throw new Message("string is grater than 10");
			}
		}
	}
	public static void main(String[]ar)
	{
		try{
			isError();
		}catch(Message e){
			System.out.println(e.getMessage());
		}
	}
}