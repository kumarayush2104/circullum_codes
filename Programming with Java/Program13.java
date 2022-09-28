// Ayush Kumar
// 202103103510253 (20)
// CS-1

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String ex) {
        super(ex);
    }
}

class Program13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        float num1 = scan.nextFloat();
        System.out.print("Enter Divisor: ");
        float num2 = scan.nextFloat();
        scan.close();
        
        try {
            if(num2 == 0) {
                throw new MyException("Division by 0 is not supported");
            } else {
                System.out.println("Answer: " + (num1/num2));
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
