import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numba 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Numba 2 : ");
        int num2 = sc.nextInt();
        
        add(num1, num2);
        
        int y = square(num2);
        System.out.println(square(num2));
        
        int z = absValue(num1);
        System.out.println(absValue(num1));
	}
	
	public static int absValue (int a){
	    if(a < 0){
	        return a * (-1);
	    }
	    else {
	        return a;
	    }
	}
	
	public static int square (int a){
	    int answer = a * a;
	    return answer;
	}
	
	public static void add (int a, int b){
    int sum = a + b;
    System.out.println(sum);
    return;
}
}