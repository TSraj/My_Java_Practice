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
		
			prln("Please give your input: ");
			//using for user input
			for (int row = 0; row < 2; row++) { 
				for (int column = 0; column < 4; column++) { 
					pr("twoDArray["+row+"]["+column+"]: ");
					twoDArray[row][column] = myScanner.nextInt();
				}
			}
			
			//printing the user input
			for (int row = 0; row < 2; row++) {
				for (int column = 0; column < 4; column++) {
						pr(twoDArray[row][column]+"\t");
				}
				prln("\n");
			}
		
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
