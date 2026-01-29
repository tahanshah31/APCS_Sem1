import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is your name?"); 
		String name  = sc.nextLine();
		
		System.out.println("What is your Age?"); 
		int age = sc.nextInt();
		
		System.out.println("What month were you born in? (0-12)"); 
		int month = sc.nextInt();
		
		System.out.println("What day were you born on? (0-31)"); 
		int day = sc.nextInt();
		
		System.out.println("What year were you born on?"); 
		int year = sc.nextInt();
		
		System.out.println("How much is a dollar and two quarters?"); 
		double money = sc.nextInt();
		
		System.out.println("You are " + name + " and you were born on " + month + ("/") + day + "/" + year + " making you " + age + " years old!!!");
		System.out.println("Also you have $" + money + " in your wallet!!!!"); 
	}
}
