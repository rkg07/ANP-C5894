package practice;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(100)); // Random number between 0-99
			
		}
		
	}
}
