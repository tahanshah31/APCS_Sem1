package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	Scanner sc = new Scanner(System.in);
	
	String name;		
	int age;			
	String breed;	
	
	public Dog() {	
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public Dog(String name){
		this.name = name;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String name, String breed){
		this.name = name;
		age = 1;
		this.breed = breed;
	}
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
		breed = "dog dog";
	}
	
	public void setName(String a){
		name = a;
	}
	public void setBreed(String b){
		breed = b;
	}
	public void setAge(int c){
		age = c;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	
	public Boolean isSleeping(){
		int chance = (int)(Math.random() * 2 + 1);
		if (chance == 1){
			return true;
		}
		if (chance != 1){
			return false;
		}
		return true;
	}
	public void Bark(){
		System.out.println("The dogs name is " + name);
		System.out.println("The dog barks! RUFFF");
	}
}
