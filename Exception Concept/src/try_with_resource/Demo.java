package try_with_resource;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int num;
		
		try(Scanner sn =new Scanner(System.in))
		{
			num =sn.nextInt();
			if(num<0)
				throw new IllegalArgumentException();
			else
				System.out.println("Your no :"+num);
		}catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");}
	}

}
