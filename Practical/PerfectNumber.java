package practice;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		int num = 28, sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
				
			}
		}
		System.out.println(num == sum);
		}
	
}

//This Java code checks whether a given number is a perfect number. Here's how it works:
//
//The integer variable num is initialized with the value 28, which is the number to be checked.
//The variable sum is initialized to 0 and will be used to store the sum of the divisors of num.
//A for loop iterates from 1 to num / 2 (inclusive). The reason for iterating only up to num / 2 is that no divisor greater than half of num can be a proper divisor.
//Inside the loop, it checks if i is a divisor of num using the modulus operator (num % i == 0). If it is, i is added to sum.
//After the loop, the code compares num with sum. If they are equal, it means num is a perfect number.