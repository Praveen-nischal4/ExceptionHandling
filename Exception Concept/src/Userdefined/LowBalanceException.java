package Userdefined;

public class LowBalanceException extends Exception{

	private String msg;
	
	LowBalanceException()
	{
		this.msg="Your Balance is less than 1000";
	}
	
	LowBalanceException(String msg)
	{
		this.msg=msg;
	}
	
	public String toString()
	{
		return "LowBalanceException :"+msg;
	}
	
}
