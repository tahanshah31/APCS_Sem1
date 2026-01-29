/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!
			
			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word you would like to hide in the crossword : ");
		String word = sc.nextLine();

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        
        int size = word.length() + 5;
        String[][] puzzle = new String [size][size];
        
        for(int r = 0; r < puzzle.length ; r++){
        	for(int c = 0; c < puzzle[r].length; c++){
        		int rnd = (int)(Math.random() * letters.length);
        		puzzle[r][c] = letters[rnd];
        	}
        }
        
        int row = (int)(Math.random() * size);
        int col = (int)(Math.random() * size);
        
        int direction = (int)(Math.random() * 3);
        if(direction == 0){
            if(col + word.length() >= size){
                col = size - word.length();
            }
        }
        else if (direction == 1){
            if(row + word.length() >= size){
                row = size - word.length();
            }
        }
        else{
            if(col + word.length() >= size){
                col = size - word.length();
            }
            if(row + word.length() >= size){
                row = size - word.length();
            }
        }
        for(int i = 0; i < word.length(); i++){
            String y = word.substring(i,i+1);
            
        if(direction == 0){
            puzzle[row][col + i] = y;
        }
        else if (direction == 1){
            puzzle[row + i][col + i] = y;
        }
        else{
            puzzle[row + i][col + i] = y;
        }
        }
        
        
        
        int counter = 0;
        while(counter < 10){
        	System.out.println(" ");
        	counter++;
        }
        System.out.println("-------Crossword Puzzels-------");
        for(int r = 0; r < puzzle.length; r++){
        	for(int c = 0; c < puzzle[r].length; c++){
        		System.out.print(puzzle[r][c] + " ");
        	}
        	System.out.println(" ");
        }

		
	}
}
