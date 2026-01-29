/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] array1 = new int [20];
		
		for(int count = 0; count < array1.length; count++){
			array1[count] = (int)(Math.random() * 10) + 1;
		}
		
		System.out.print("Array Elements : ");
		for(int count = 0; count < array1.length; count++){
			System.out.print(array1[count] + " ");
		}
		
		System.out.println(" ");
		int rnd1 = (int)(Math.random() * 10) + 1;
		System.out.println("The target number is : " + rnd1);
		
		int duplicate1 = 0;
		for(int count = 0; count < array1.length; count++){
			if (array1[count] == rnd1){
				System.out.println("Duplicate found at index : " + count);
				duplicate1++;
			}
		}
		System.out.println("The total number of duplicates of " + rnd1 + " is : " + duplicate1 + " number of duplicates");
		
		int counter = 0;
		for(int count = 0; count < array1.length - 1; count++){
			if(array1[count] == array1[count + 1]){
				System.out.println("Two in a row found at indexes " + count + " and " + (count + 1) + ". The number is " + array1[count]);
				counter++;
			}
		}
	}
}
