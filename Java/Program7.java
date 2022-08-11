// Ayush Kumar
// 202103103510253 (20)
// CS-1

import java.util.Random;

public class Program7 {
    public static void main(String[] args) {
        Random ranGen = new Random();
        System.out.printf("%c%c%c %d\n", (ranGen.nextInt(25)+65), (ranGen.nextInt(25)+65), (ranGen.nextInt(25)+65), (ranGen.nextInt(8999) +1000));
    }
}
