/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class Spidey {
	public static void main(String args[]) {
		Spiderman Tobey = new Spiderman("Tobey Maguire", 48 , "Green Goblin");
		Spiderman Andrew = new Spiderman("Andrew Garfield", 40 , "Electro");
		Spiderman Tom = new Spiderman("Tom Holland", 27);
		Tom.setvillian("Vulture");
		Spiderman Miles = new Spiderman("Miles Morales");
		Miles.setAge(18);
		Miles.setvillian("Prowler");

		System.out.println(Tobey.getActor() + " Fights " + Tobey.getvillian());
		
		System.out.println(Andrew.getActor() + " Fights " + Andrew.getvillian());
		
		System.out.println(Tom.getActor() + " Fights " + Tom.getvillian());
		
		System.out.println(Miles.getActor() + " Fights " + Miles.getvillian());
		
		Tobey.printArt();
	}
}
