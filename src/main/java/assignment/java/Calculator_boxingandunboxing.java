package assignment.java;
import java.util.Scanner;

public class Calculator_boxingandunboxing {
	
	 public static void main(String[] args) {
		 
	    	double num1, num2;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter First number:");
	        num1 = scanner.nextDouble();
	        System.out.print("Enter Second number:");
	        num2 = scanner.nextDouble();

	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        scanner.close();
	        double output;

	        switch(operator)
	        {
	            case '+':
	            	output = num1 + num2;
	                break;

	            case '-':
	            	output = num1 - num2;
	                break;

	            case '*':
	            	output = num1 * num2;
	                break;

	            case '/':
	            	output = num1 / num2;
	                break;

	            /* If User enters any other operator or char apart from
	             * +, -, * and /, then display an error message to user
	             * 
	             */
	            default:
	                System.out.printf("You have entered wrong operator");
	                return;
	        }

	        System.out.println(num1+" "+operator+" "+num2+  ":: "+output);
	    }	 
		 
}
	


