// Ayush Kumar
// 202103103510253 (20)
// CS-1

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i] = scan.nextInt();
        }

        scan.close();

        System.out.println("\n\n");

        for(int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
