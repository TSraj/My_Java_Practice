package First;

import java.util.Scanner;

public class UserInput1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num; 
		
		System.out.println("Enter the number: ");
		num = input.nextInt();
		
		System.out.println("The number is: " +num);
	}
}
