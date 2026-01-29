import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Please input your first interger : "); 
	int num1  = sc.nextInt();
		
	System.out.println("Please input your second interger : "); 
	int num2  = sc.nextInt();
		 
	System.out.println("  ");
		 	
	if (num1 % 2 == 0)
	{
            System.out.println("The first integer is even");
    }
    else
    {
            System.out.println("The first integer is odd");
    }
		
	if (num2 % 2 == 0) 
	{
            System.out.println("The second integer is even");
    } 
    else 
    {
            System.out.println("The second integer is odd");
    }
    
    System.out.println(" ");
		
	if (num1 % 3 == 0)
	{
            System.out.println("The first integer is divisible by 3");
    } 
    else if (num1 % 4 == 0)
    {
            System.out.println("The first integer is divisible by 4");
    }
    else if (num1 % 5 == 0)
    {
            System.out.println("The first integer is divisible by 5");
    }
    else
    {
            System.out.println("The first integer is not divisible by 3,4,5");
    }
    
    
    if (num2 % 3 == 0)
	{
            System.out.println("The second integer is divisible by 3");
    } 
    else if (num2 % 4 == 0)
    {
            System.out.println("The second integer is divisible by 4");
    }
    else if (num2 % 5 == 0)
    {
            System.out.println("The second integer is divisible by 5");
    }
    else
    {
            System.out.println("The second integer is not divisible by 3,4,5");
    }
	}
}
