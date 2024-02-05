package Userdefined;

public class Voting {

	public static void checkAge(int age) throws AgeCheckException
	{
		if(age<18)
		{
			throw new AgeCheckException("age not valid");
		}else
		{
			System.out.println("Eligible for voting with age :"+age);
		}
	}
	public static void main(String[] args) {
   
		try {
			Voting.checkAge(15);
		}catch(AgeCheckException e)
		{
			System.out.println(e);
		}
				

	}

}
