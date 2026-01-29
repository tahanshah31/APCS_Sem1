package pkg;
import java.util.*;

public class BankAccount {
	 String owner;
	 int AccountNumber;
	 double Balance;
	 Boolean isActive;
	 public static int nextAccountNumber = (int)(Math.random() * 950 + 50) + 1;


	public BankAccount (){
		 owner = ("Unknown");
		 AccountNumber = nextAccountNumber;
		 Balance = 0;
		 isActive = true;
		 nextAccountNumber = nextAccountNumber + 1;
		 
	}
	
	
	public BankAccount (String o){
		 owner = o;
		 AccountNumber = nextAccountNumber;
		 Balance = 0;
		 isActive = true;
		 nextAccountNumber = nextAccountNumber + 1;
		 
	}
	public BankAccount (String o, int b){
		 owner = o;
		 AccountNumber = nextAccountNumber;
		 Balance = b;
		 isActive = true;
		 nextAccountNumber = nextAccountNumber + 1;
		 
	}
	

	// -------METHODS-------
	
	public void bankaccToString(){		
		System.out.println("------------------------------");
		System.out.println("Owner : " + owner);
		System.out.println("AccountNumber : " + AccountNumber);
		System.out.println("Balance : " + Balance);
		System.out.println("Is the account active : " + isActive);
		System.out.println("------------------------------");
		System.out.println("");
	}

}