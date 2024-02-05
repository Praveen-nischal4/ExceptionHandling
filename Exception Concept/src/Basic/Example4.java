package Basic;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		int num;
		Scanner sn = new Scanner(System.in);

		try
		{
			System.out.println("Please enter number");
			num =sn.nextInt();
			if(num<0)
			{
				throw new IllegalArgumentException("Input can'y be negative ");
			}else
			{
				System.out.println("Entered number is "+num);
			}
		}catch(IllegalArgumentException e)
		{
			System.out.println("Error Message :"+e.getMessage());
		}finally
		{
			
			sn.close();
		}
	}

}
