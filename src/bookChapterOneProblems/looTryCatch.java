package bookChapterOneProblems;

import java.util.Scanner;

public class looTryCatch {
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
//		int a=10, b=20;
//		prln(calculateNumber(a, b));
		
//		int[] numberArray = new int[100];
//		int i =100;
//		
//		while (i>0) {
//			numberArray[i-1]=i;
//			i--;
//		}
		
		int[][] twoDArray = new int[2][4];
		twoDArray[0][0] =1;
		twoDArray[0][1] =2;
		twoDArray[0][2] =4;
		twoDArray[0][3] =5;
		
		twoDArray[1][0] =2;
		twoDArray[1][1] =4;
		twoDArray[1][2] =5;
		twoDArray[1][3] =9;
		
//			prln("Please give your input: ");
			//using for user input
//			for (int row = 0; row < 2; row++) { 
//				for (int column = 0; column < 4; column++) { 
//					pr("twoDArray["+row+"]["+column+"]: ");
//					twoDArray[row][column] = myScanner.nextInt();
//				}
//			}
			
			//try catch final
			try {
				//printing the user input
//				for (int row = 0; row < 2; row++) {
//					for (int column = 0; column < 4; column++) {
//							pr(twoDArray[row][column]+"\t");
//					}
//					prln("\n");
//				}
				
				pr("Please give a number: ");
				int userInput = myScanner.nextInt();
				while (userInput!=200) {
					prln(100/userInput);
					pr("Please give a number: ");
					userInput = myScanner.nextInt();
				
				
				}
			} catch (Exception unknException) {
				unknException.printStackTrace();
			}finally {
				prln("come out of try-catch block");
			}
			
			prln("Thank you for using our program");			
		
//		for (int j = 2; j < 100; j*=2) {
//			prln(j);
//		}
	} 
	
	static int calculateNumber(int num1, int num2) {
		int result;
		result = num1+num2;
		return result;
	}
	
	static void prln(Object anObject) {
		System.out.println(anObject);
	}
	
	static void pr(Object anObject) {
		System.out.print(anObject);
	}
}
