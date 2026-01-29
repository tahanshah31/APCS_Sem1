import java.util.Scanner;

class starter {
	
	public static int pow(int a, int b){
		int count = 0;
		int ans = 1;
		while(count < b){
			ans = ans * a;
			count = count + 1;
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick a base number : "); 
		int num1  = sc.nextInt();
		
		System.out.println("Pick a second number : "); 
		int num2  = sc.nextInt();
		
		System.out.println(pow(num1,num2));
	}
}
