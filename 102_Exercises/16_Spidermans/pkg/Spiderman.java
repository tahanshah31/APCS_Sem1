package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?
	
	public Spiderman() {		// Default Constructor
		actor = ("Unknown");
		age = 0;
		villain = ("Unkown");
	}
	
	public Spiderman(String a){		// int, String, String, int Constructor
		actor = a;
		age = 0;
		villain = ("Unkown");
	}
	
	public Spiderman(String a, int b){		// int, String, String, int Constructor
		actor = a;
		age = b;
		villain = ("Unkown");
	}
	
	public Spiderman(String a, int b, String c){		// int, String, String, int Constructor
		actor = a;
		age = b;
		villain = c;
	}
	
	public Spiderman(int b){		// int, String, String, int Constructor
		actor = ("Unknown");
		age = b;
		villain = ("Unkown");
	}
	
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
	public void setActor(String a){
		actor = a;
	}
	public String getActor(){
		return actor;
	}
	
	public void setAge(int b){
		age = b;
	}
	public int getAge(){
		return age;
	}
	
	public void setvillian(String c){
		villain = c;
	}
	public String getvillian(){
		return villain;
	}
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
