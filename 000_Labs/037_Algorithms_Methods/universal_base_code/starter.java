
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] array1 = new int [100];
		int rnd1 = (int)(Math.random() * 100) + 1;
		
		for(int count = 0; count < array1.length; count++){
			array1[count] = (int)(Math.random() * 99) + 1;
			System.out.println(" ");
		}
		
		toStringArray(array1);
		getArrayAverage(array1);
		getArrayMax(array1);
		getArrayMin(array1);
		
	}
	
	public static void toStringArray(int [] x){
		System.out.print("The elements are : ");
		System.out.print(" ");
		for (int count = 0; count < x.length; count++){
			System.out.print(x[count] + " ");
		}
	}
	
	public static void getArrayAverage(int [] y){
		double sum = 0;
		for(int count = 0; count < y.length; count++){
			sum = sum + y[count];
		}
		sum = sum / y.length;
		System.out.print("The average is : " + sum);
	}
	
	public static void getArrayMax(int [] c){
		int min1 = Integer.MAX_VALUE;
		for(int count2 = 0; count2 < c.length; count2++){
			if(c[count2] < min1){
				min1 = c[count2];
			}
		}
		System.out.print("The minimum is : " + min1);
	}
	
	public static void getArrayMin(int [] b){
		int max1 = Integer.MIN_VALUE;
		for(int count = 0; count < b.length; count++){
			if(b[count] > max1){
				max1 = b[count];
			}
		}
		System.out.print("The maximum is : " + max1);
	}
	
	
}
