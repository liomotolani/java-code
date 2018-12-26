
public class Account {
	private String name; // instance variable declared private 
	private double balance;
	
	public Account(String name, double balance) // A constructor which must have the same name has the class name
	{
		this.name = name;// assign name to instance variable name
		
		if(balance>0.0)
			this.balance = balance; // assign balance to instance variable balance
	}
	
	public void deposit(double depositAmount)// method to add valid deposit amount to balance
	{
		if(depositAmount>0.0)// condition to check if amount is valid
			balance = balance + depositAmount; // the new balance
	}
	public void  withdraw(double withdrawAmount)
	{
		if(withdrawAmount>balance) 
           System.out.println("Withdrawal amount exceeded balance");
		if(balance>withdrawAmount)
			balance = balance - withdrawAmount;
		}
	public double getBalance(){ //method to balance
		return balance;
	}
	//The parameter 'name' in the constructor Account and the method setName are not visible to each other.
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName () 
	{
		 return name;
	}

}
