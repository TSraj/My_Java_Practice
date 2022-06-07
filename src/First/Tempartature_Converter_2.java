package First;

import java.util.Scanner;

public class Tempartature_Converter_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double fahrenheit, celsius;
		System.out.println("Enter the fahrenheit: ");
		fahrenheit = input.nextDouble();
		
		celsius = 0.555*(fahrenheit - 32);
		System.out.println("The converted celsius is: "+celsius);
	}
}
