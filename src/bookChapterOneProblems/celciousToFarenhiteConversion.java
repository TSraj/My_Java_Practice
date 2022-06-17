package bookChapterOneProblems;

import java.util.Scanner;

public class celciousToFarenhiteConversion {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		double celsius, fahrenhit;
		System.out.println("Enter the temparature in celsius: ");
		celsius = myScanner.nextDouble();
		fahrenhit =(celsius*9/5)+32;
		System.out.println("The temparature in fahrenhite is: "+fahrenhit);
	}
}
