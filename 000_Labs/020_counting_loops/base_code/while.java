import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		
		System.out.println("Choose how many times should I repeat it? "); 
		int times  = sc.nextInt();
		int count = 0;
		
		while(true){
			if(count == times){
				break;
			}
			System.out.println(name);
			count = count + 1;
		}
		
	}
}
