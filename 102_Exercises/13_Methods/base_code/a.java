
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean isLeapYear(int y){
		if (y%4 == 0){
			return true;
		}
		else {
			return false;
		}
	}

	public static int getDigitSum(int a){
		int sum = 0;
		
		while(a > 0){
			sum = sum + (a % 10);
			a = a / 10;
		}
		return sum;
	}
	
	public static void printIfConsecutive(int a, int b, int c){
		if (b == a + 1 && c == a + 2){
			System.out.println("The numbers are consecutive!");
		}
		else{
			System.out.println("The numbers are not consecutive!");
		}
	}

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}

