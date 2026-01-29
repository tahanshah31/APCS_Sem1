import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int answers = (int)(Math.random() * 3);
        System.out.println("Let's play a guessing game! I will give you two hints and let's see if you can guess it!");

        if (answers == 0) {
            System.out.println("It is a planet in your Universe!");
            String guess = sc.nextLine();

            if (guess.equals("Earth") || guess.equals("earth")) {
                System.out.println("Congrats! You got it correct!");
            }
            else {
                System.out.println("Not correct! Here is another hint: it has humans living on it");
                String guess2 = sc.nextLine();
                
                if (guess2.equals("Earth") || guess2.equals("earth")) {
                    System.out.println("Congrats! You got it correct!");
                }
                else {
                    System.out.println("Not correct! The answer was Earth!");
                }
            }
        }
        
        if (answers == 1) {
            System.out.println("It is a furry animal!");
            String guess = sc.nextLine();

            if (guess.equals("Cat") || guess.equals("cat")) {
                System.out.println("Congrats! You got it correct!");
            }
            else {
                System.out.println("Not correct! Here is another hint: it has paws");
                String guess2 = sc.nextLine();
                
                if (guess2.equals("Cat") || guess2.equals("cat")) {
                    System.out.println("Congrats! You got it correct!");
                }
                else {
                    System.out.println("Not correct! The answer was Cat!");
                }
            }
        }
        if (answers == 2) {
            System.out.println("It is a subject!");
            String guess = sc.nextLine();

            if (guess.equals("Math") || guess.equals("math")) {
                System.out.println("Congrats! You got it correct!");
            }
            else {
                System.out.println("Not correct! Here is another hint: it has numbers involved");
                String guess2 = sc.nextLine();
                
                if (guess2.equals("Math") || guess2.equals("math")) {
                    System.out.println("Congrats! You got it correct!");
                }
                else {
                    System.out.println("Not correct! The answer was Math!");
                }
            }
        }
        }

        
    }
