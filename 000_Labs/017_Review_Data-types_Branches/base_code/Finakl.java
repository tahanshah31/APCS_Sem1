import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
	System.out.println("What is your name? "); 
	String name  = sc.nextLine();
		
	System.out.println("What is your title? EX : Slayer of Dragons "); 
	String title  = sc.nextLine();
		
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue? "); 
	String type  = sc.nextLine();
		
	if (type.equals("Wizard") || type.equals("wizard")){
		System.out.println("Congrats you are a Wizard!! Good luck");
		}
			else if(type.equals("Warrior") || type.equals("warrior")){
				System.out.println("Congrats you are a Warrior!! Good luck");
			}
				else if(type.equals("Rogue") || type.equals("rogue")){
					System.out.println("Congrats you are a Rogue!! Good luck");
				}
			
	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
	int points = 20;
		
	System.out.println("Strength (0-10) : "); 
	int strength  = sc.nextInt();
	points = points - strength;
	System.out.println("You have " + points + " points left"); 
		
	System.out.println("Dexterity (0-10) : "); 
	int dexterity  = sc.nextInt();
	points = points - dexterity;
	System.out.println("You have " + points + " points left"); 
		
	System.out.println("Intelligence (0-10) : "); 
	int intelligence  = sc.nextInt();
	points = points - intelligence;
		if(intelligence > points){
			System.out.println("Please input a smaller value. Intelligence (1-10): ");
			intelligence = sc.nextInt();
			System.out.println("You have " + points + " points left");
		}
			else{
				System.out.println("You have " + points + " points left"); 
			}
		
	System.out.println("Charisma (0-10) : "); 
	int charisma  = sc.nextInt();
	points = points - charisma;
		if(charisma > points){
			System.out.println("Please input a smaller value. Charisma (1-10): ");
			charisma = sc.nextInt();
			System.out.println("You have " + points + " points left");
		}
			else{
				System.out.println("You have " + points + " points left"); 
		}
		System.out.println("-----------------------");
		
		System.out.println("You are " + name + ", the " + title + " of CVHS");
		System.out.println("You are " + type + "with the following status ");
		
		System.out.println("Strength : " + strength);
		System.out.println("Dextreity : " + dexterity);
		System.out.println("Intelligence : " + intelligence);
		System.out.println("Charisma : " + charisma);
	}
}
