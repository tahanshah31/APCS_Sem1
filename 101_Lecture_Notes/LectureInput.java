
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        
        double item1Price = 44.99;
        double item2Price = 27.99;
        double item3Price = 22.99;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tahan's Bonatical Garden's ");
        System.out.println("Here is a list of our services");
        System.out.println("1. Entire View Of The Gardens & Access To The Lagoons - $" + item1Price + "🎄");
        System.out.println("2. Access To The Lagoons & Private Spas - " + item2Price + "🌺");
        System.out.println("3. Entry To The Gardens & Buffet - " + item3Price + "🍲");
        System.out.println();
        
        
        System.out.println("What's the name for your order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many tickets of the Entire View Of The Gardens & Access To The Lagoons would you like? ");
        int quantity1 = sc.nextInt();
        System.out.println("How many tickets of the Access To The Lagoons & Private Spas would you like? ");
        int quantity2 = sc.nextInt();
        System.out.println("How many tickets of the Entry To The Gardens & Buffet would you like? ");
        int quantity3 = sc.nextInt();
        
        double total1 = item1Price * quantity1;
        double total2 = item2Price * quantity2;
        double total3 = item3Price * quantity3;
        double total4 = total1 + total2 + total3;
        
        System.out.println("Your current total is = $" + total4);
        System.out.println("How much % would you like to tip?");
        double tipPercent = sc.nextDouble();
        double Tip = total4 * (tipPercent/100);
        
        double grandTotal = Tip + total4;
        
        System.out.println("");
        System.out.println(name + "'s Receipt :");
        System.out.println(quantity1 + "x Entire View Of The Gardens & Access To The Lagoons = " + total1);
        System.out.println(quantity2 + "x Access To The Lagoons & Private Spas = " + total2);
        System.out.println(quantity3 + "x Entry To The Gardens & Buffet = " + total3);
        System.out.println("--------------------------");
        System.out.println("The Tip Percent is -" + tipPercent  + " & The Final Tip is = " + Tip);
        System.out.println("--------------------------");
        System.out.println("Grand Total Is = $" + grandTotal);
	}
}
