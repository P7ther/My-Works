package checkSystem;

import java.util.Scanner;

public class SumTest {
	
	public static void main(String[] args) 
	{
		int a,b;
        char op;
        
        Scanner scan = new Scanner(System.in);
        // Take two numbers as input from user
        System.out.println(" Enter Two Number:");
        a=scan.nextInt();
        b=scan.nextInt();
      
     // Taking operator as input from user
        System.out.println("Enter an Operator");
        op = scan.next().charAt(0);
        
        
        switch(op) {
        
        case '+':
        	System.out.format(" %d + %d = %d\n :", a, b, a+b);
        	break;
        case '-':
            System.out.format("%d - %d = %d\n", a, b, a - b);
            break;
        case '*':
            System.out.format("%d * %d = %d\n", a, b, a * b);
            break;
        case '/':
            System.out.format("%d / %d = %d\n", a, b, a / b);
            break;
        default:
            System.out.println("ERROR: Unsupported Operation");
        
        
        }
		
		
		
		
		
		
		
	}

}
