package First;

import java.util.Scanner;

public class Practice_Problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2,div; 
		
		System.out.println("Enter first number: ");
		num1 = input.nextInt(); 
		System.out.println("Enter second Number: ");
		num2 = input.nextInt();
		
		div = num1/num2;
		System.out.println("The output is: " +div);
	}
}
