/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int rnd1 = (int)(Math.random() * 150) + 51;
		int [] array1 = new int [rnd1];
		
		for(int count = 0; count < array1.length; count++){
			array1[count] = (int)(Math.random() * 99) + 1;
			System.out.println(" ");
		}
		
		System.out.print("The elements are : ");
		System.out.print(" ");
		for (int count1 = 0; count1 < array1.length; count1++){
			System.out.print(array1[count1] + " ");
		}

		int min1 = Integer.MAX_VALUE;
		for(int count2 = 0; count2 < array1.length; count2++){
			if(array1[count2] < min1){
				min1 = array1[count2];
			}
		}
		
		int max1 = Integer.MIN_VALUE;
		for(int count3 = 0; count3 < array1.length; count3++){
			if(array1[count3] > max1){
				max1 = array1[count3];
			}
		}
		
		double sum = 0;
		for(int count4 = 0; count4 < array1.length; count4++){
			sum = sum + array1[count4];
		}
		sum = sum / array1.length;
		
		System.out.println(" ");
		System.out.println("The maximum of " + array1.length + " random number is: " + max1);
		System.out.println("The minimum of " + array1.length + " random number is: " + min1);
		System.out.println("The average of " + array1.length + " random number is: " + sum);
	}
}
