package First;

import java.util.Scanner;

public class Problem_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2,multiplication;
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		multiplication = num1*num2;
		
		System.out.println("The multiplication is: " +multiplication);
	}
}
