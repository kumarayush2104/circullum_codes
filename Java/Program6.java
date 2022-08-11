// Ayush Kumar
// 202103103510253 (20)
// CS-1

public class Program6 {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        if(args.length != 1) {
            System.out.println("This Program requires single argument, you have provided " + args.length + " argument");
        } else if(args[0].length()>1) {
            System.out.println("This Program requires a character as an argument");
        } else {
            try {
                Integer.parseInt(args[0]);
                System.out.println("This Program requires a character as an argument");
            } catch(Exception ex) {
                int key = 0;
                for (char c : vowels) {
                    if(args[0].equals(String.valueOf(c))) {
                        key = 0;
                        break;
                    } else {
                        key = 1;
                    }
                }

                if(key==0) {
                    System.out.printf("%s is a Vowel\n", args[0]);
                } else {
                    System.out.printf("%s is a Consonent\n", args[0]);
                }
            }
        }
    }
}
