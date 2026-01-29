import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick a random number betwenn 1 and 1000 : "); 
		int gamble  = sc.nextInt();
		
		int answer = (int)(Math.random() * (1000 - 1) + 1);
		
		if(gamble == answer){
			System.out.println("You got the answer correct!!");
		}
		else if(gamble > answer){
			System.out.println("Your guess is higher than the correct answer which is : " + answer);
		}
		else if(gamble < answer){
			System.out.println("Your guess is lower than the correct answer which is : " + answer);
		}
	}
}
