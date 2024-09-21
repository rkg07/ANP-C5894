package practice;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year:");
		int num = sc.nextInt();
//		int year = num;
		
		boolean isLeap = (num % 4 == 0 && num % 100 != 0) || (num % 400 == 0);
		
		System.out.println(isLeap);
		
	}
}