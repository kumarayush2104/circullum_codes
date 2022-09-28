// Ayush Kumar
// 202103103510253 (20)
// CS-1


import java.util.Scanner;

class Program14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        String[] arr1 = new String[scan.nextInt()];
        
        try{
            int sum = 0;
            for(int i=0; i<arr1.length; i++) {
                System.out.print("Enter int " + i + " : ");
                arr1[i] = scan.next();
            }

            for(int i = 0; i<arr1.length; i++) {
                sum += Integer.parseInt(arr1[i]);
            }

            try {

                for(int i = 0; i < arr1.length; i++) {
                    System.out.println(1/Float.parseFloat(arr1[i]));
                }
                
            } catch(Exception ex) {
                System.out.println("Error Caught: " + ex);
            }

            System.out.print("Enter Index number to check its value: ");
            System.out.println(arr1[scan.nextInt()]);
           
        } catch(NumberFormatException ex) {
            System.out.println("Error Caught: " + ex);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error Caught: " + ex);
        }
        scan.close();
    }
}
