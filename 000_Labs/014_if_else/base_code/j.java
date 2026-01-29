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
		else{
			System.out.println("You did not guess the correct answer. The answer is " + answer);
		}
	}
}
