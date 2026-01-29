/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		System.out.println("Presenting Shut Up And Drive By Rihanna");
		
		String[] lyrics;
		lyrics = new String[10];
		
		lyrics[0] = "Get you where you wanna go, if you know what I mean";
		lyrics[1] = "Got a ride that's smoother than a limousine";
		lyrics[2] = "Can you handle the curves? Can you run all the lights?";
		lyrics[3] = "If you can, baby boy, then we can go all night";
		lyrics[4] = "Cause I'm zero to sixty in 3.5";
		lyrics[5] = "Baby, you got the keys";
		lyrics[6] = "Now shut up and drive, drive, drive";
		lyrics[7] = "Shut up and drive, drive, drive";
		lyrics[8] = "I got class like a '57 Cadillac";
		lyrics[9] = "Got overdrive with a whole lot of boom in the back";
		
		int count = 0;
		while(count < 10){
			System.out.println(lyrics[count]);
			count = count + 1;
		}


		
	}
}
