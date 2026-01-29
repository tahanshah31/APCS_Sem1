
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a sentence: ");
		String sent = sc.nextLine();

		String word = " ";
		String word1 = " ";
		String word2 = " ";
		String answer = " ";
		
		while(sent.indexOf(" ") != -1){
			word = sent.substring(0,sent.indexOf(" "));
			sent = sent.substring(sent.indexOf(" ") + 1);
			
			word1 = word.substring(0,1);
			word2 =" ";
			
			if(word.length() > 1){
				word2 = word.substring(1,2);
			}
			
			if (word1.equalsIgnoreCase("a") || word1.equalsIgnoreCase("e") || word1.equalsIgnoreCase("i") || word1.equalsIgnoreCase("o") || word1.equalsIgnoreCase("u")){
				answer = word + " way";
			}
			else if(!word2.equalsIgnoreCase("a") && !word2.equalsIgnoreCase("e") && !word2.equalsIgnoreCase("i") && !word2.equalsIgnoreCase("o") && !word2.equalsIgnoreCase("u")){
				answer = word.substring(2) + " " + word1 + word2 + "ay";
			}
			else{
				answer = word.substring(1) + " " + word1 + "ay";
			}
			
			System.out.println(answer);
		}
		
		word = sent;
		word1 = word.substring(0,1);
		word2 = " ";
		
		if(word.length() > 1){
			word2 = word.substring(1,2);
		}
		
		if (word1.equalsIgnoreCase("a") || word1.equalsIgnoreCase("e") || word1.equalsIgnoreCase("i") || word1.equalsIgnoreCase("o") || word1.equalsIgnoreCase("u")){
				answer = word + " way";
			}
		else if(!word2.equalsIgnoreCase("a") && !word2.equalsIgnoreCase("e") && !word2.equalsIgnoreCase("i") && !word2.equalsIgnoreCase("o") && !word2.equalsIgnoreCase("u")){
				answer = word.substring(2) + " " + word1 + word2 + "ay";
			}
		else{
				answer = word.substring(1) + " " + word1 + "ay";
			}
			
			System.out.println(answer);
		
	}
}
