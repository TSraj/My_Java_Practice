package First;

import java.util.Scanner;

public class vowelconsonantcheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letter;
		
		System.out.println("Enter a character: ");
		letter = input.next().charAt(0);
		
		if (letter== 'a') {
			System.out.println("Vowel");
		} else if (letter=='e') {
			System.out.println("Vowel");
		}else if (letter=='i') {
			System.out.println("Vowel");
		}else if (letter=='o') {
			System.out.println("Vowel");
		}else if (letter=='u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}
}
