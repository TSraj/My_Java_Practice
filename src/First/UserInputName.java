package First;

import java.util.Scanner;

public class UserInputName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.println("Enter your name: ");
		
		name = input.nextLine(); 
		System.out.println("The name is: " +name);
	}
}
