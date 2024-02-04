package Basic;

import java.util.Scanner;

public class Example1 {
	
	
	public static void main(String[] args) {

        int num1,num2;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter two num as num1 & num2");
        num1=sn.nextInt();
        num2 =sn.nextInt();
        
        try
        {
        	int result =num1/num2;
        	System.out.println("Result is : "+result);
        }catch(ArithmeticException e)
        {
        	System.out.println("Number cannot be divided by Zero");
        }
        
        System.out.println(" Execution Continuou");

	}

}
