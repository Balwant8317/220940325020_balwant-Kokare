public class BankAccount
{
	private static int AccountNumber=10000;
	private static double currentInterestRate=0.05;
	
	public static void setCurrentRate(double newRate)
	
	{
		currentRate=newRate;
	}
	
	private int accountNumber;
	private double balance;
	private double rates;
	
	public Account(double initialBalance)
	{
		accountNumber=AccountNumber++;
		balance=initialBalance;
		rate=currentInterestRate;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getCurrentRate()
	{
		return rate;
	}
	public void deposite(double amount)
	{
		if(amount>balance)
			System.out.println("account overdown");
		return false;
		
		else
		{
			balance-=amount;
			return true;
		}
		
	}
	
}