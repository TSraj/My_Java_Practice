package bookChapterOneProblems;

import java.util.Scanner;

public class bookStore {
	
	static Scanner myScanner = new Scanner(System.in);
	
	static String[] books = {"Java", "C", "Python"}; 
	static final double studentDiscount = 0.3;
	static final double teacherDiscount = 0.4;
	static final double alienDiscount = 0.0;
	
	public static void main(String[] args) {
		prln("------Welcome to our Book Store------");
		prln("Which book do you want?\nAns: ");
		
		String userChoice= myScanner.nextLine();
		if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
			prln("You opted for: "+books[0]+" Book");
			calculatePrice(books[0]);
		}else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
			prln("You opted for: "+books[1]+" Book");
			calculatePrice(books[1]);
		}else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
			prln("You opted for: "+books[2]+" Book");
			calculatePrice(books[2]);
		}else {
			prln("Sorry we don't have that book");
		}
	}
	
	static void calculatePrice(String bookName) {
		prln("Are you Student, Teacher, Alien?\nAns: ");
		String answer = myScanner.nextLine();
		double  price = 200;
		
		if (answer.toLowerCase().equals("teacher")) {
			price = price-(price*teacherDiscount);
			showPrice(price);
		}else if (answer.toLowerCase().equals("student")) {
			price = price-(price*studentDiscount);
			showPrice(price);
		}else if (answer.toLowerCase().equals("alien")) {
			price = price-(price*alienDiscount);
			showPrice(price);
		}else {
			prln("Sorry we can't serve you!!");
		}
	}
	
	static void showPrice(double price) {
		prln("Your total payable ammount: "+price);
		prln("\n-----------Thank you for sopping with us--------------");
	}
	
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	
	static void pr(Object anObject) {
		System.out.print(anObject);
	}
}
