import java.util.Scanner;

public class SimpleCalculator {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static long mul(int a, int b) {
		return (long)a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		
		int num1, num2;
		char op;

		Scanner scanner = new Scanner(System.in);
		System.out.println("---Simple Calculator---");

		System.out.print("Enter first number: ");
		num1 = scanner.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = scanner.nextInt();
		
		System.out.println("Enter an operation: ");
		op = scanner.next().charAt(0);
		
		 if (op == '/' && num2 == 0) {
            		System.out.println("Math ERROR");
           		scanner.close();
           		return;
        	}
		
		long result;
			
		if(op == '+') result = add(num1, num2);
		else if(op == '-') result = sub(num1, num2);
		else if(op == '*') result = mul(num1, num2);
		else if(op == '/') result = div(num1, num2);
		else {
			System.out.println("Invalid operation!");
			scanner.close();
			return;
		}

		System.out.println("Result = " + result);
		scanner.close();
	}
}
















