import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter an interger : "); 
		int num1  = sc.nextInt();
		System.out.println("Please enter another interger (Bigger than the first number) : "); 
		int num2  = sc.nextInt();
		
		if(num2 < num1){
			System.out.println("Your second number is not bigger than the first number");
			
			System.out.println("Please enter another interger (Bigger than the first number) : "); 
			num2  = sc.nextInt();
		}
		
		System.out.println("Your range is between " + num1 + " and " + num2);
		
		int num3 = (int)(Math.random() * (num2 - num1) + num1);
		int num4 = (int)(Math.random() * (num2 - num1) + num1);
		int num5 = (int)(Math.random() * (num2 - num1) + num1);
		int num6 = (int)(Math.random() * (num2 - num1) + num1);
		int num7 = (int)(Math.random() * (num2 - num1) + num1);
		System.out.println("Here are 5 numbers generated in that range : " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + ", and " + num7);
	}
}
