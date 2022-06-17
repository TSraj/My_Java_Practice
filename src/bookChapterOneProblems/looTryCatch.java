package bookChapterOneProblems;

public class looTryCatch {
	public static void main(String[] args) {
//		int a=10, b=20;
//		prln(calculateNumber(a, b));
		
		int[] numberArray = new int[100];
		int i =100;
		
		while (i>0) {
			numberArray[i-1]=i;
			i--;
		}
		
//		while (i<100) {
//			prln("array["+i+"]: "+numberArray[i]);
//			i++;
//		}
		
//		int j = 1;
//		do {
//			prln("do-while loop");
//			prln(j);
//			j--;
//		} while (j<2 && j>0);
//		j =2;
//		while (j<2 && j>0) {
//			prln("While loop");
//			prln(j);
//			j--;
//		}
		
		for (int j = 2; j < 100; j*=2) {
			prln(j);
		}
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
		System.out.println(anObject);
	}
}
