package Userdefined;

public class LowBalance {

	public static void main(String[] args) {
       try
       {
    	   LowBalance.checkBalance(64.250);
       }catch(LowBalanceException e)
       {
    	   System.out.println(e);
       }

	}

	public static void checkBalance(double balance) throws LowBalanceException
	{
		if(balance <1000)
		{
			throw new LowBalanceException();
		}else
		{
			System.out.println(" Your current balance is :"+balance);
		}
	}
}
