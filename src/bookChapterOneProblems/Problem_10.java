package bookChapterOneProblems;

import java.util.Scanner;

public class Problem_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radians, degree;
		
		System.out.println("Enter the radian value: ");
		radians = input.nextDouble();
		
		degree = radians * 57.29;
		System.out.println("The degree value is: "+degree);
	}
}
