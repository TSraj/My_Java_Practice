package First;

import java.util.Scanner;

public class Temparature_Converter {
	public static void main(String[] args) {
		//Celsius To Fahrenheit Convert
		
		Scanner input = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.println("Enter the celsius: ");
		celsius = input.nextDouble();
		
		fahrenheit = 1.8 * celsius + 32;
		
		System.out.println("The temparature in fahrenheit is: "+fahrenheit);
	}
}
