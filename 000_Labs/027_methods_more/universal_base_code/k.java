
import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which account would you like to make? (no info, just name, name and an initial deposit) ");
		String bankacc = sc.nextLine();
		
		int initialdeposit = 0;
		if (bankacc.equals("no info")){
			BankAccount x = new BankAccount();
			x.displayAccountInfo();
		}
		if(bankacc.equals("just name")){
			System.out.println("Whats your name?");
			String name = sc.nextLine();
			BankAccount y = new BankAccount(name);
			y.displayAccountInfo();
			
		}
		
		if(bankacc.equals("name and an initial deposit")){
			System.out.println("Whats your name?");
			String name1 = sc.nextLine();
			System.out.println("Whats your initial deposit?");
			initialdeposit = sc.nextInt();
			String rnd = sc.nextLine();
			
			BankAccount z = new BankAccount(name1, initialdeposit);
			z.displayAccountInfo();
		}
		
		System.out.println("Would you like to check your balance of this account? (yes/no)");
		String checkacc = sc.nextLine();
		
		if (checkacc.equals("yes")){
			System.out.println("Balance : $" + initialdeposit);
			System.out.println("Thank you for your buisness!");
		}
		else if(checkacc.equals("no")){
			System.out.println("Thank you for your buisness!");
			return;
			
		}
	}
}
