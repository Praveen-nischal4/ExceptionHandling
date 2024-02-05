package Advanced;

public class Example3 {

	public static void CheckAge(int age) throws Exception
	{
		if(age<18)
			throw new ArithmeticException("Age must not less then 18 to vote");
		else if(age>18 & age<50)
			throw new IllegalAccessException("U can vote but withing 5min");
		else
		{
			throw new Exception(" No vote at all");
		}
	}
	public static void main(String[] args) throws Exception{
       
         CheckAge(21);	
        System.out.println("Excecution contd");
	}

}
