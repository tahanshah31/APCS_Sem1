
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] aaray1 = new int [1001];
		 int value1 = 3;
		 int index1 = 0;
		 
		 while(index1 < 1001){
		 	aaray1[index1] = value1;
		 	value1 = value1 + 3;
		 	index1 = index1 + 1;
		 }
		 
		 int counter = 0;
		 while(counter < 1001){
		 	System.out.println(aaray1[counter]);
		 	counter ++;
		 }
		 
		 int [] aaray2 = new int [1001];
		 int value2 = 1000;
		 int index2 = 0;
		 
		 while(index2 < 1001){
		 	aaray2[index2] = value2;
		 	value2 = value2 - 1;
		 	index2 = index2 + 1;
		 }
		 
		 int counter1 = 0;
		 while(counter1 < 1001){
		 	System.out.println(aaray2[counter1]);
		 	counter1 ++;
		 }
	}
}
