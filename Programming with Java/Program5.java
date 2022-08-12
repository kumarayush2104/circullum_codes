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
        int small = arr[0];
        int median = 0;
        for (int i : arr) {
            if(large < i) large = i;
            if(small > i) small = i;
        }

        for (int i : arr) {
            if(large != i && small != i) median = i;
        }

        if(median == 0) {
            int count = 0;
            for (int i: arr) {
                if(large == i) {
                    count++;
                    if(count == 2) {
                        median = large;
                    }
                }
            }
            if(median == 0) {
                median = small;
            }
        }

        System.out.println("\nDecreasing order: ");
        System.out.printf("%d %d %d\n", large, median, small);

    }
}
