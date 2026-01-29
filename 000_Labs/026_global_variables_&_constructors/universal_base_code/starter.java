
import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount x = new BankAccount("Tahan", 1000);
		x.bankaccToString();
		
		BankAccount y = new BankAccount("Alie");
		y.bankaccToString();
		
		BankAccount z = new BankAccount();
		z.bankaccToString();
		
		BankAccount c = new BankAccount("Landon", 5000);
		x.bankaccToString();
	}
	
	
}
