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
		
		System.out.println("How many rows would you like for your 2D array?" );
		int rows = sc.nextInt();
		
		System.out.println("How many columns would you like for your 2D array?" );
		int columns = sc.nextInt();
		
		int[][] nums = new int[rows][columns];
		for(int r = 0; r < rows; r++){
			for(int c = 0; c < columns; c++){
				nums[r][c] = (int)(Math.random()* 10) + 1;
			}
		}
		
		printArray(nums);
		
		System.out.println("What row would you like to get the average of?");
		int rownum = sc.nextInt();
		
		printAverage(nums, rownum);
		double avg = TotalAverage(nums);
		
		System.out.println("The average of the 2D array is " + avg);
		
	}
	
	public static void printArray(int[][] y){
		for(int r = 0; r < y.length; r++){
			for(int c = 0; c < y[r].length; c++){
				System.out.print(y[r][c] + " ");
			}
			System.out.println(" ");
		}
	}
	
	public static void printAverage(int[][] y, int rows){
		double sum = 0;
		
		for(int c = 0; c < y[rows].length; c ++){
			sum = sum + y[rows][c];
		}
		
		double average;
		average = sum / y[rows].length;
		
		System.out.println("The row average is " + average);
	}
	
	public static double TotalAverage(int[][] y){
		double sum = 0;
		double counter = 0;
		
		for(int r = 0; r < y.length; r++){
			for(int c = 0; c < y[r].length; c++){
				sum = sum + y[r][c];
				counter++;
			}
		}
		
		double finalavg = sum/counter;
		return finalavg;
	}
	
}
