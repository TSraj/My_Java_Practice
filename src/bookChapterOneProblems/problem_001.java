package bookChapterOneProblems;

import java.util.Scanner;

public class problem_001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, sum, sub, mul, div;
		
		System.out.println("Enter number one: ");
		num1 = input.nextInt();
		System.out.println("Enter number two: ");
		num2 = input.nextInt();
		
		sum = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		
		System.out.println("The sum is: "+sum);
		System.out.println("The sub is: "+sub);
		System.out.println("The mul is: "+mul);
		System.out.println("The div is: "+div);
	}
}
