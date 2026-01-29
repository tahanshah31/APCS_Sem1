import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please input your first number : "); 
		int num1  = sc.nextInt();
		
		System.out.print("Please input your second number : "); 
		int num2  = sc.nextInt();
		
		if(num1 == num2)
		{
			System.out.println("Your numbers are the same!!");
		}
		else if(num1 != num2)
		{
			System.out.println("Your numbers are different!!");
		}
	}
}
