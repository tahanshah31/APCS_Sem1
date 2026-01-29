/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please say a word or a phrase: ");
		String word = sc.nextLine();	
		String a = " ";
		
		while(word.indexOf(" ") != -1){
			a = word.substring(0,word.indexOf(" "));
			System.out.print(SpongeCase(a) + " ");
			word = word.substring(word.indexOf(" ") + 1);
		}
		System.out.print(SpongeCase(word));
		
	}
	public static String SpongeCase(String y) {
		String z = "";
		
		for(int i = 0; i < y.length(); i++){
			String x = y.substring(i, i+1);
			if (i % 2 == 0){
				x = x.toLowerCase();
			}
			else{
				x = x.toUpperCase();
			}
			z = z + x;
		}
		return z;
	}
		
	}
