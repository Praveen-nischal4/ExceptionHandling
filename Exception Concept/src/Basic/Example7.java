package Basic;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) throws Exception{
		
		Example7.checkNumber(10);

	}

	public static void checkNumber(int num) throws Exception
	{
		
		Scanner sn =new Scanner(System.in);
		
		if(num<=0)
		{
		
		throw new IllegalArgumentException("Number must greater then zero");
		}else
		{
			System.out.println("Number is postive ="+num);
		}
	}
}
