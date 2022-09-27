// Ayush Kumar
// 202103103510253 (20)
// CS-1

class Program14 {
    public static void main(String[] args) {
        String[] arr1 = {"1", "4", "6", "a", "B", "9"};
        
        try{
            for(int i = 0; i<7; i++) {
                Integer.parseInt(arr1[i]);
            }
            try {
                String[] arr2 = {"1", "4", "6", "a", "B", "9"};
                for(int i = 0; i<7; i++) {
                    System.out.println(arr2[i]);
                }
            } catch(Exception ex) {
                System.out.println("Error Caught: " + ex);
            }
           
        } catch(NumberFormatException ex) {
            System.out.println("Error Caught: " + ex);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error Caught: " + ex);
        }
    }
}
