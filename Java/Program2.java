// Ayush Kumar
// 202103103510253 (20)
// CS-1

import java.util.Scanner;

class Program2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First number: ");
		Integer num1 = scan.nextInt();
		System.out.print("Enter Second number: ");
		Integer num2 = scan.nextInt();
		System.out.print("Enter + for Addition\nEnter - for Subtraction\nEnter * for Multiplication\nEnter / for division\n: ");
		char a = scan.next().charAt(0);
		scan.close();

		switch(a) {
			case '+':
				System.out.println("Addition: " + (num1+num2));
				break;
			case '-':
				System.out.println("Subtraction: " + (num1-num2));
				break;
			case '*':
				System.out.println("Multiplication: " + (num1*num2));
				break;
			case '/':
			if(num2 == 0) {
				System.out.println("Division with 0 is not supported");
			} else {
				System.out.println("Division: " + (num1/num2));
			}
			break;
		}
	}
}

