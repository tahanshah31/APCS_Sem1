/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first name and last name with a space in the middle.");
		String name = sc.nextLine();
		
		int x = name.indexOf(" ");
		String lastname = name.substring(x + 1);
		
		System.out.println("Your last name is " + lastname);



		
	}
}
