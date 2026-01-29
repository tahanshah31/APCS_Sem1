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
		
		System.out.println("Enter a sentence.");
		String sent = sc.nextLine();
		String word = " ";
		
		while(sent.indexOf(" ") != -1){
			word = sent.substring(0,sent.indexOf(" ")) + " " + word;
			sent = sent.substring(sent.indexOf(" ") + 1);
		}
		
		System.out.println(sent + " " + word);
	
	}
}
