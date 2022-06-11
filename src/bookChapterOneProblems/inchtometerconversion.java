package bookChapterOneProblems;

import java.util.Scanner;

public class inchtometerconversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double inch, meter;
		System.out.println("Enter the inch value: ");
		inch = input.nextDouble();
		
		meter = inch*0.0254;
		System.out.println(inch + " Inch is: " +meter+ " Meters");
	}
}
