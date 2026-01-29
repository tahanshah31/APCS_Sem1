import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Choices are between an animal, face, or object? Please choose one : "); 
	String choice  = sc.nextLine();
	if (choice.equals("Animal")){
		System.out.println(" ,,;;;`; ");
		System.out.println(",~(  )  \\|");
		System.out.println("' / /");
	}
	else if(choice.equals("Face")){
		System.out.println("////\\\\\\\\");
		System.out.println("| () () |");
		System.out.println("|   ^   |");
		System.out.println("| _____ | ");
		System.out.println("_________");
	}
	else if(choice.equals("Object")){
		System.out.println("   /<<<<< ");
		System.out.println("   ^ ");
		System.out.println("////\\\\\\\\");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("__________");
	}
	}
}
