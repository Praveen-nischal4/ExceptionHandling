package Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

       int age;
     Scanner sn = new Scanner(System.in);
     System.out.println("Enter your age");
   
     try
     {
    	  age =sn.nextInt();
    	 if(age>18)
    	 {
    		 System.out.println("Eligible for voting");
    	 }else
    	 {
    		 System.out.println("Not eligible");
    	 }
     }catch(InputMismatchException e)
     {
    	 System.out.println(" Input formate don't match");
     }
     
     System.out.println("Execution continuou");

	}

}
