/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */
        
        
        
        // Feel free to comment out the test code above when you start your assignment

        if(diff == 1){
            int counter = 1;
            
            while(true){
                String[] words = new String[counter];
                for(int count = 0; count < counter; count++){
                    words[count] = getColorWord();
                }
            
        
        
            System.out.println("--------------------------------");
            
            for(int count = 0; count < words.length; count++){
                Colors.println(words[count]);
            }
            
            System.out.println("--------------------------------");
            
            System.out.println("Memorize the phrase above");
            System.out.print("You have : ");
            delay(5);
        
            for(int count = 0; count < 20; count++){
            System.out.println(" ");
            }
        
            System.out.println("Please enter the words that you in between the split lines");
            String input = sc.nextLine();
        
            int correct = 1;
            for(int count = 0; count < counter; count ++){
            if(!words[count].equals(input)){
                correct = 3;
                }
            }
            if (correct == 3){
            System.out.println("You got it wrong! Try again next time");
            System.out.println("Words : ");
            for(int count = 0; count < words.length; count ++){
                System.out.println(words[count]);
            }
            break;
            }
            else {
            System.out.println("Congrats next round!!");
            counter++;
            
            }
        
        }
    }
        else if(diff == 2){
           int counter = 1;
           int checker = 1;
            
            while(true){
                String[] words = new String[counter];
                String[] colors = new String[counter];
                for(int count = 0; count < counter; count++){
                    words[count] = getColorWord();
                    colors[count] = getColorWord();
                }
            
        
        
            System.out.println("--------------------------------");
            
            for(int count = 0; count < counter; count++){
                Colors.println(words[count], "BRIGHT_" + colors[count]);
            }
            
            System.out.println("--------------------------------");
            
            System.out.println("Memorize the phrase above");
            System.out.print("You have : ");
            delay(5);
        
            for(int count = 0; count < 20; count++){
            System.out.println(" ");
            }
            
            String input1;
            
            if(checker == 1){
                System.out.println("Please enter the words that you in between the split lines");
                input1 = sc.nextLine();
            }
            else {
                System.out.println("Please enter the text colors that you in between the split lines");            
                input1 = sc.nextLine();
            }
            
            int correct = 1;
            for(int count = 0; count < counter; count ++){
            if(checker == 1 && !words[count].equals(input1)){
                correct = 3;
                }
            if (checker == 2 && !colors[count].equals(input1)){
                correct = 3;
            }
            }
            
            if (correct == 3){
            System.out.println("You got it wrong! Try again next time");
            System.out.println("Words : ");
            for(int count = 0; count < counter; count ++){
                System.out.println(words[count] + " ");
            }
            
            System.out.println("Text Colors : ");
            for(int count = 0; count < counter; count ++){
                System.out.println(colors[count]);
                break;
            }
        }
            
            
            System.out.println("Congrats next round!!");
            counter++;
            checker++;
            
           if(checker > 2){
               checker = 1;
           }
    }
        
}

        else if(diff == 3){
           int counter = 1;
           int checker = 1;
            
            while(true){
                String[] words = new String[counter];
                String[] colors = new String[counter];
                String[] background = new String[counter];
                for(int count = 0; count < counter; count++){
                    words[count] = getColorWord();
                    colors[count] = getColorWord();
                    background[count] = getColorWord();
                }
            
        
        
            System.out.println("--------------------------------");
            
            for(int count = 0; count < words.length; count++){
                Colors.println(words[count], "COLORS " + colors[count], "BACKGROUND " + background[count]);
            }
            
            System.out.println("--------------------------------");
            
            System.out.println("Memorize the phrase above");
            System.out.print("You have : ");
            delay(5);
        
            for(int count = 0; count < 20; count++){
            System.out.println(" ");
            }
            
            String input1;
            
            if(checker == 1){
                System.out.println("Please enter the words that you in between the split lines");
                input1 = sc.nextLine();
            }
            else if(checker == 2) {
                System.out.println("Please enter the text colors that you in between the split lines");            
                input1 = sc.nextLine();
            }
            else{
                System.out.println("Please enter the background colors that you in between the split lines");            
                input1 = sc.nextLine();
            }
            
            int correct = 1;
            
            for(int count = 0; count < counter; count ++){
                if(checker == 1){
                    if(!input1.equals(words[count])){
                    correct = 3;
                    }
                }
                else if(checker == 2){
                    if(!input1.equals(colors[count])){
                        correct = 3;
                    }
                }
                else if(checker == 3){
                    if(!input1.equals(background[count])){
                        correct = 3;
                    }
                }
            }
            
            if (correct == 3){
            System.out.println("You got it wrong! Try again next time");
            System.out.println("Words : ");
            for(int count1 = 0; count1 < counter; count1 ++){
                System.out.println(words[count1] + " ");
            }
            
            System.out.println("Text Colors : ");
            for(int count2 = 0; count2 < counter; count2 ++){
                System.out.println(colors[count2] + " ");
            }
            
            System.out.println("Background Colors : ");
            for(int count3 = 0; count3 < counter; count3 ++){
                System.out.println(background[count3] + " ");
            }
            break;
        }
        else{
            System.out.println("Congrats!!");
            counter++;
            checker++;
        }
        }
        }
        else {
            System.out.println("Wrong number, try again.");
        }
        
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
