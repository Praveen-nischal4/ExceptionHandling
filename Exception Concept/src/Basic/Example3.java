//Program below demonstrate ArrayIndexOutOfBoundException :

package Basic;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
	
		
		Scanner sn =new Scanner(System.in);
		
		try
		{
			int a[] =new int[3];
			a[0]=5;
			a[1]=4;
			a[2]=8;
			a[4]=5;
			
		}catch(NegativeArraySizeException f)
		{
			System.out.println("Negative array size won't allowed"+f.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
       finally
       {
    	   sn.close();
       }
	}

}
