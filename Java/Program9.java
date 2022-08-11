// Ayush Kumar
// 202103103510253 (20)
// CS-1

import java.util.Random;

public class Program9 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] arr = new int[6][6];

		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				arr[i][j] = (random.nextInt(2));
			}
		}

		for(int i = 0; i < 6; i++) {
			System.out.print("| ");
			for(int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("|");
		}
		System.out.println("\nRows's Containing odd number of 1's:");

		for(int i = 0; i < 6; i++) {
			int sum = 0;
			for(int j = 0; j < 6; j++) {
				sum += arr[i][j];
			}
			if(sum%2 != 0) {
				System.out.println("Row " + (i+1) + " has odd number of 1's");
			}
		}

		System.out.println("\nColumn's Containing odd number of 1's:");
		for(int i = 0; i < 6; i++) {
			int sum = 0;
			for(int j = 0; j < 6; j++) {
				sum += arr[j][i];
			}
			if(sum%2 != 0) {
				System.out.println("Column " + (i+1) + " has odd number of 1's");
			}	
		}
	}

}
