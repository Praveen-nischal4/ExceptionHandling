//We can omit catch block in writting try block then u must include finally block
// finally block used to specify a block of code that will be executed regardless of whether an exception is thrown or not

package Basic;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

        int arr[] = new int[4]; 
		Scanner sn = new Scanner(System.in);
		
		try
		{
			arr[0]=6;
			arr[1]=5;
			arr[2]=54;
			arr[5]=65;
		}finally
		{
			
			System.out.println("End program");
			sn.close();
		}
	}

}
