import java.util.Scanner;

class Reverse {
    public Reverse(int[] num) {
        for(int i = (num.length-1);i != 0; i--) {
            System.out.println(num[i]);
        }
    }
}
public class Program10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i] = scan.nextInt();
        }
        scan.close();
        new Reverse(arr);
    }
}
