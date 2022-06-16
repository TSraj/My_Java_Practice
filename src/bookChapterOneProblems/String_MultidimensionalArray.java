package bookChapterOneProblems;
import java.util.concurrent.atomic.AtomicBoolean;

public class String_MultidimensionalArray {
	public static void main(String[] args) {
		
		//This is for string example
		String my_name;
		my_name = new String("Tanver Sadik");
		
//		System.out.println("This is our old method");
//		System.out.println(my_name);
		
		
//		prln("This is our new method");
//		prln(my_name);
//		prln("\n\nThe length of this string is: " +my_name.length());
		
		
		//This is for Two Dymension Array
		int[][] twoDArray = new int[2][4];
		twoDArray[0][0] =1;
		twoDArray[0][1] =2;
		twoDArray[0][2] =4;
		twoDArray[0][3] =5;
		
		twoDArray[1][0] =2;
		twoDArray[1][1] =4;
		twoDArray[1][2] =5;
		twoDArray[1][3] =9;
		
		//1 2 4 5
		//2 4 5 9
		
		twoDArray[1][2]+=(twoDArray[0][2]+twoDArray[0][3]);
		prln("At twoDARray[1][2]: "+twoDArray[1][2]);
	}
	
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	
	static void pr(Object anyObject) {
		System.out.println(anyObject);
	}
}
