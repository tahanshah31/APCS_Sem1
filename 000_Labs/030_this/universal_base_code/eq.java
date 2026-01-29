/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int rand1 = (int)(Math.random() + 1);
		PooleDwarf dwarf1 = new PooleDwarf(randName(), rand1);
		PooleDwarf dwarf2 = new PooleDwarf(randName(), rand1);
		PooleDwarf dwarf3 = new PooleDwarf(randName(), rand1);
		PooleDwarf dwarf4 = new PooleDwarf(randName(), rand1);
		PooleDwarf dwarf5 = new PooleDwarf(randName(), rand1);
		PooleDwarf dwarf6 = new PooleDwarf(randName(), rand1);
		PooleDwarf dwarf7 = new PooleDwarf(randName(), rand1);
		
		int count = 0;
		String d1 = dwarf1.getName();
		
		if(dwarf2.isSameName(d1)){
			count = count + 1;
		}
		if(dwarf3.isSameName(d1)){
			count = count + 1;
		}
		if(dwarf4.isSameName(d1)){
			count = count + 1;
		}
		if(dwarf5.isSameName(d1)){
			count = count + 1;
		}
		if(dwarf6.isSameName(d1)){
			count = count + 1;
		}
		if(dwarf7.isSameName(d1)){
			count = count + 1;
		}
		
		System.out.println("The first Dwarfs name is : " + d1);
		System.out.println("The Number of duplicates there is : " + count);
	}
}
