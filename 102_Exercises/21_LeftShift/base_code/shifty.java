/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("---------------------------------------------");

		/*
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		*/
	}

	public static void printArray(String[] arr){
		for (int x = 0; x < arr.length; x ++) {
			System.out.println(arr[x]);
		}
	}

	public static void leftShift(String [] arr){
		String temp = arr[0];
		for (int y = 0; y < arr.length-1; y++) {
			arr[y] = arr[y+1];
		}
		arr[arr.length-1] = temp;
	}

	public static void leftShift(String [] arr, int num){
		for (int y = 0; y < num; y++) {
			leftShift(arr);
		}
	}
}
