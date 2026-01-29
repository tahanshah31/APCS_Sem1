/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number and we'll print out every prime until that number: ");
		int num1 = sc.nextInt();
		
		printPrimes(num1);
	}
	
	public static Boolean checkPrime(int a){
		if (a < 2){
			return false;
		}
		int count = 2;
		while(count < a){
			if(a % count == 0) {
				return false;
			}
			count = count + 1;
		}
	return true;
	}
	public static void printPrimes(int b){
		int num2 = 2;
		while(num2 < b){
			if(checkPrime(num2)){
				System.out.println(num2);
			}
			num2 = num2 + 1;
		}
	}
}
