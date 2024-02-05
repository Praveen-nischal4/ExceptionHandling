package Advanced;

public class Example1 {

	public static void main(String[] args) {
		
		int arr[] = new int[4];
		
		try
		{
			try
			{
			arr[1]=4;
			arr[5]=56;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			
			try
			{
				String mystr =null;
				System.out.println("Length of String :"+mystr.length());
			}catch(NullPointerException n)
			{
				System.out.println(n.getMessage());
			}
		}catch(NegativeArraySizeException a)
		{
			System.out.println(a.getMessage());
		}finally
		{
			System.out.println("Execution continous");
		}

	}

}
