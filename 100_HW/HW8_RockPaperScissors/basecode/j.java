import java.util.Scanner;

class starter {
    
    public static String getObject(){
        int x = (int)(Math.random()* 3);
        if (x == 0){
            return "rock";
        }
        else if (x == 1){
            return "paper";
        }
        else if (x == 2){
            return "scissors";
        }
        return "rock";
    }
    
    public static int compare2(String player1, String player2){
        if (player1.equals(player2)){
            return 0;
        }
        else if (player1.equals("rock") && player2.equals("scissors")){
            return 1;
        }
        else if(player1.equals("paper") && player2.equals("rock")){
            return 1;
        }
        else if(player1.equals("scissors") && player2.equals("paper")){
            return 1;
        }
        else {
            return 2;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("Would you like to play the computer? (yes/no/done)");
		String answer = sc.nextLine();
		
		if (answer.equals("done")){
		    break;
		}
		if (answer.equals("yes")){
		    System.out.println("--------------------------------------------------------------");
		    System.out.println("Please enter rock/paper/scissors:");
		    String type = sc.nextLine();
		    
		    String computer = getObject();
		    int result = compare2(type, computer);
		    
		    if (result == 0){
		        System.out.println("Its a Tie!");
		    }
		    else if (result == 1){
		        System.out.println("You win!");
		    }
		    else{
		        System.out.println("Computer Wins!");
		    }
		}
		
		if (answer.equals("no")){
		    System.out.print("How many time would you like the computer to play? ");
            int rounds = sc.nextInt();
            String rnd = sc.nextLine();
                
            int ply1Wins = 0;
            int ply2Wins = 0;
            int tie = 0;
            int count = 0;
		
            while(count < rounds){
                String player1 = getObject();
                String player2 = getObject();
                int results = compare2(player1, player2);
                
                count = count + 1;
                if(results == 0){
                    tie = tie + 1;
                }
                else if (results == 1){
                    ply1Wins = ply1Wins + 1;
                }
                else{
                    ply2Wins = ply2Wins + 1;
                }
            }
            System.out.println("Computer 1 won : " + ply1Wins + " times");
            System.out.println("Computer 2 won : " + ply2Wins + " times");
            System.out.println("There was a tie : " + tie + " times");
		    }
		}
    }
}
    
