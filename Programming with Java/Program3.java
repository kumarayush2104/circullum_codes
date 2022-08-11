// Ayush Kumar
// 202103103510253 (20)
// CS-1

import java.util.Scanner;;

public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter unit in meter: ");
        double meter = scan.nextInt();
        scan.close();

        System.out.printf("%.2f in feet: %.2f", meter, (meter*3.281));

    }
}
