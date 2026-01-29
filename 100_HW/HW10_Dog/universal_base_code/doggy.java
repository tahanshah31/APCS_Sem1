/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Dog dog1  = new Dog("Oreo");
		dog1.setAge(5);
		
		Dog dog2 = new Dog("Cami","Golden Doodle");
		
		Boolean sleep1 = dog1.isSleeping();
		Boolean sleep2 = dog2.isSleeping();
		
		if (sleep1){
			System.out.println(dog1.getName() + " is asleep");
		}
		else {
			dog1.Bark();
		}
		
		if (sleep2 && sleep1 == false){
			dog2.Bark();
		}
		else {
			dog2.Bark();
		}
	}
}
