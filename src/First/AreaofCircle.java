package First;

import java.util.Scanner;

public class AreaofCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radious, area;
		
		System.out.println("Enter the radious: ");
		radious = input.nextDouble();
		
		area = 3.1416 * radious * radious;
		
		System.out.println("The area of circle is: "+area);
	}
}
