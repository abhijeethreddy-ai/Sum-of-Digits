package day6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		

	
		        Scanner scanner = new Scanner(System.in);

		        // Prompt user to enter an integer
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();

		        int sum = 0;
		        int temp = Math.abs(number); // Handle negative numbers

		        // Calculate the sum of digits
		        while (temp != 0) {
		            sum += temp % 10;
		            temp /= 10;
		        }

		        System.out.println("Sum of digits: " + sum);

		        scanner.close();
		    }
		

}
