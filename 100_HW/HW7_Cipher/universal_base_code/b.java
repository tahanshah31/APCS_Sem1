import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.println(Cipher.keyedEncode("Please make the homework easier!!", 4));

		Scanner input = new Scanner(System.in);

        System.out.print("Enter your message you would like to be encoded: ");
        String message  = sc.nextLine();

        System.out.print("Would you like to use a key? ");
        String answer  = sc.nextLine();
        
        if (answer.equals("Yes")) {
            System.out.print("Enter your key between the numbers 0 and 35 :  ");
            int key  = sc.nextInt();
            String finalanswer = Cipher.keyedEncode(message, key);
        } else {
        	String finalanswer = Cipher.encode(message);
        }
        System.out.println("Here is your final message : " + finalanswer);
        
        
		String code1 = "6v lvp u5vuy5 y1z5 qpsqy5r";
		System.out.println(Cipher.encode(code1));
		
		String code2 = "sv8vq17r 1r q25 85rq";
		System.out.println(Cipher.encode(code2));
		
		String code3 = "q25 z5l qv wpx85s f 1r gg";
		System.out.println(Cipher.encode(code3));
		
		String code4 = "z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz";
		System.out.println(Cipher.keyedEncode(code4, 33));
		
		String code5 = "29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d";
		System.out.println(Cipher.encode(code5));
		
		String code6 = "a8 1oy 92 1kx rxdj in 4";
		System.out.println(Cipher.keyedEncode(code6, 8));
		
		String code7 = "549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8";
		String code8 = (Cipher.keyedEncode(code7, 13));
		System.out.println(Cipher.keyedEncode(code8, 29));
		
		String code9 = "lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw";
		System.out.println(Cipher.encode(code9));
		
		int count = 0;
		while (count < 36) {
	    String code10 = "u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y";
    	String code11 = Cipher.keyedEncode(code10, count);
    	System.out.print("The Key is : " + count);
    	System.out.println(" " + code11);
    	count++;
		}
		System.out.println("-----------------------------------------------------------");
		int counter = 0;
		while (counter < 36) {
            String code12 = "amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct";
            String code13 = Cipher.keyedEncode(code12, counter);
            System.out.print("The Key is: " + counter);
            System.out.println(" " + code13);
            counter++;
        }
        
	}
}

