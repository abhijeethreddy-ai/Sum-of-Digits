# Sum-of-Digits - Java Program
🔍 Description
This Java program calculates the sum of the digits of an integer provided by the user. It handles both positive and negative integers by converting negative inputs to their absolute values before processing.

🛠️ How It Works
User Input: The program prompts the user to enter an integer.

Processing:

Converts the input to its absolute value to handle negative numbers.

Iteratively extracts each digit using the modulus operator (% 10).

Adds each digit to a cumulative sum.

Removes the last digit by dividing the number by 10.

Output: Displays the sum of the digits to the user.

💻 Example Output
yaml
Copy
Edit
Enter an integer: -12345
Sum of digits: 15
▶️ How to Run
Requirements
Java Development Kit (JDK) installed on your system.

Steps
Save the Code: Save the provided code in a file named SumOfDigits.java.

Open Terminal/Command Prompt: Navigate to the directory containing SumOfDigits.java.

Compile the Program:

bash
Copy
Edit
javac SumOfDigits.java
Run the Program:

bash
Copy
Edit
java SumOfDigits


🧾 Notes
The program uses Math.abs() to handle negative inputs, ensuring accurate digit summation.

It employs a while loop to process each digit efficiently.

For very large numbers, consider using BigInteger to avoid integer overflow.
