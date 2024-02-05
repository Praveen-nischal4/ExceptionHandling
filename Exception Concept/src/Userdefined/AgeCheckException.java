//User Defined Checked Exception

package Userdefined;

public class AgeCheckException extends Exception{

	private String msg;

	AgeCheckException()
	{
		this.msg="Age is not valid";
	}
	
	AgeCheckException(String msg)
	{
		this.msg=msg;
		
	}
	
	public String toString()
	{
		return "Age Exception :"+ msg;
	}
}
