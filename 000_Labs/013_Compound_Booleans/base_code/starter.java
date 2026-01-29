import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please input your first number : "); 
		int num1  = sc.nextInt();
		
		System.out.print("Please input your second number : "); 
		int num2  = sc.nextInt();
		
		System.out.print("Please input your third number : "); 
		int num3  = sc.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is larger than " + num2 + " and " + num3);
		}
		if((num2 > num3) && (num2 > num1)) {
			System.out.println(num2 + " is larger than " + num3 + " and " + num3);
		}
		if((num3 > num2) && (num3 > num1)) {
			System.out.println(num3 + " is larger than " + num2 + " and " + num1);
		}
		
		
		if((num1 < num2) && (num1 < num3)) {
			System.out.println(num1 + " is smaller than " + num2 + " and " + num3);
		}
		if((num2 < num3) && (num2 < num1)) {
			System.out.println(num2 + " is smaller than " + num3 + " and " + num3);
		}
		if((num3 < num2) && (num3 < num1)) {
			System.out.println(num3 + " is smaller than " + num2 + " and " + num1);
		}
		
	
	}
}
