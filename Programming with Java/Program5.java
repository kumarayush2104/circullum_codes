// Ayush Kumar
// 202103103510253 (20)
// CS-1

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i = 0; i<arr.length; i++) {
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i] = scan.nextInt();
        }

        scan.close();

        int large = arr[0];

        if(large < arr[1]) large = arr[1];
        if(large < arr[2]) large = arr[2];

        System.out.println("\nLargest number: " + large);
    }
}
