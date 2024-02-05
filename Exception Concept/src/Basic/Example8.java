package Basic;

public class Example8 {
 public  static void checkMessage(String msg) throws IllegalArgumentException
 {
	 if(msg.isEmpty())
	 {
		 throw new IllegalArgumentException("There should be message");
	 }else
	 {
		 System.out.println("Your message : "+msg);
	 }
 }
 public static void main(String[] args) {
	    try {
	        checkMessage("");
	    } catch (IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }
	}


}
