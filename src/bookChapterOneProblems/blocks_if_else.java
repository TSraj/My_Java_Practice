package bookChapterOneProblems;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class blocks_if_else {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		String my_name;
		prln("Please write your name: ");
		my_name = input.nextLine();
		
		prln(my_name);
		prln("\n\nThe length of this string is: " +my_name.length());
		
		
		
		
		int[][] twoDArray = new int[2][4];
		
		twoDArray[0][0] =1;
		twoDArray[0][1] =2;
		twoDArray[0][2] =4;
		twoDArray[0][3] =5;
		
		twoDArray[1][0] =2;
		twoDArray[1][1] =4;
		twoDArray[1][2] =5;
		twoDArray[1][3] =9;
		
		twoDArray[1][2]+=(twoDArray[0][2]+twoDArray[0][3]);
		
		if (my_name.length()>15 || my_name.length()<3) {
			prln("Your name is too long or too short");
		}
		else {
				switch (my_name.length()) {
				case 7:
					prln("You have a lucky name");
					break;
				case 6:
					prln("You have a 6 character name");
					break;
				case 5:
					prln("You have a 5 charcater name");
					break;
				case 9:
					prln("You have a 9 character name");
					break;

				default:
					prln("Your name is ok");
					break;
				}
			
//			if (my_name.length()==7) {
//				prln("You have a lucky name");
//			}else {
//				prln("Your name is ok");
//			}	
		}
		
		prln("At twoDARray[1][2]: "+twoDArray[1][2]);
	}
	
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
}
