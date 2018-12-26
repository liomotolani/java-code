import java.util.Scanner;
public class Accountest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initial name and balance since i have a value for both name and balance
		Account account1 = new Account ("Omotolani Ligali", 10000.0);
		Account account2 = new Account ("Oluwatomisin Ligali",-20000.0);
		//displays initial name and balance for both account1 and account2 
		System.out.printf("%s balance is: N%.2f%n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance is: N%.2f%n%n", account2.getName(),account2.getBalance());
		
		//allows the scanner obtain input through the command window
        Scanner input = new Scanner (System.in);
        
        
        System.out.print("Enter deposit amount of account1 :");// a prompt
        double depositAmount = input.nextDouble();// allows me input new deposit amount
        
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);// displays the deposit amount i want to add
        
       account1.deposit(depositAmount);// adds the deposit amount to the initial balance
       
       System.out.printf("%s balance is: N%.2f%n", account1.getName(),account1.getBalance());// displays new balance for account1 
		System.out.printf("%s balance is: N%.2f%n%n", account2.getName(),account2.getBalance());// displays initial balance for account2
		
		
		 System.out.print("Enter deposit amount of account2 :"); // a prompt to enter deposit amount
	     depositAmount = input.nextDouble();// allows me input new deposit amount
	        
	     System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount); // displays deposit added to account2
	     account2.deposit(depositAmount);// adds the deposit to account2 
        
	     System.out.printf("%s balance is: N%.2f%n", account1.getName(),account1.getBalance()); // displays balance
		 System.out.printf("%s balance is: N%.2f%n%n", account2.getName(),account2.getBalance());// displays new balance for account2
		 
		 System.out.print("Enter withdrawal amount of account1 : ");
		 double withdrawAmount = input.nextDouble();
		 
		 System.out.printf("%nsubtracting %.2f from account1 balance%n%n", withdrawAmount);
		 
		 account1.withdraw(withdrawAmount);
		 System.out.printf("%s balance is: N%.2f%n", account1.getName(),account1.getBalance());// displays new balance for account1 
			System.out.printf("%s balance is: N%.2f%n%n", account2.getName(),account2.getBalance());// displays initial balance for account2
			          
	}

}
