package Basic;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		int age;
		Scanner sn = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter your age");
			age = sn.nextInt();
			
			if(age >=18)
			{
				System.out.println("Eligible for Voting");
			}else
			{
				throw new ArithmeticException("Age is not suitable");
			}
		}catch(ArithmeticException e)
		{
			System.out.println(" Error Message :"+e.getMessage());
		}finally
		{
			sn.close();
		}

	}

}
