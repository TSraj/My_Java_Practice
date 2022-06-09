package First;

import java.util.Scanner;

public class Reverseinteger {
	public static void main(String[] args) {
		int num, reverse =0, reminder;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num = input.nextInt();
		
		while (num !=0) {
			reminder = num%10;
			reverse = reverse*10+reminder;
			num = num/10;
		}
		System.out.println("The reverse number is: "+reverse);
	}
}
