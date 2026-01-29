import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Slot Machine Rules: "); 
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money."); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10."); 
		System.out.println("   a. If two numbers match, you double your money."); 
		System.out.println("   b. If three numbers match, you triple your money."); 
		System.out.println("   c. If none match, you lose your money."); 
		System.out.println("---------------------------------------------------------"); 
		
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) : ");
		String answer = sc.nextLine();
		
		int money = 100;
		int wager = 0;
		
		while (true) {
            if (answer.equals("Yes") || answer.equals("y") || answer.equals("Y") || answer.equals("yes")) {

                if (money == 0) {
                    System.out.println("You're out of money! Game over!");
                    break;
                }

                System.out.println("You have $" + money + " How much would you like to wager?");
                wager = sc.nextInt();
                sc.nextLine();

                money = money - wager;

                int num1 = (int)(Math.random() * 10);
                int num2 = (int)(Math.random() * 10);
                int num3 = (int)(Math.random() * 10);

                System.out.println("Great lets roll!");
                System.out.println(num1 + " | " + num2 + " | " + num3);

                if (num1 == num2 && num2 == num3) {
                    System.out.println("Your wager has been tripled!!");
                    money = (wager * 3) + money;
                    System.out.println(money + "$ is how much cash you have left");
                } 
                else if (num1 == num2 || num2 == num3 || num1 == num3) {
                    System.out.println("Your wager has been doubled!!");
                    money = (wager * 2) + money;
                    System.out.println(money + "$ is how much cash you have left");
                } 
                else {
                    System.out.println("You did not get any gamble correct!");
                    System.out.println("This is how much money you have left : " + money + "$");
                }

                if (money <= 0) {
                    System.out.println("You're out of money! Game over!");
                    break;
                }

                System.out.println("Would you like to play the slots? (Yes/yes/Y/y) : ");
                answer = sc.nextLine();
            } 
            else if (answer.equals("No") || answer.equals("n") || answer.equals("N") || answer.equals("no")) {
                System.out.println("So Sad to see you leave!");
                break;
            } 
        }
    }
}
