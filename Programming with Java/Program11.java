// Ayush Kumar
// 202103103510253 (20)
// CS-1

abstract class Shape {
    abstract double Area(double[] arg);
}

class Triangle extends Shape {
    public double Area(double[] arg) {
        return arg[0]*arg[1]*0.5;
    }
}

class Rectangle extends Shape {
    public double Area(double[] arg) {
        return arg[0]*arg[1];
    }
}

class Circle extends Shape {
    public double Area(double[] arg) {
        return arg[0]*3.14*arg[0];
    }
}

public class Program11 {
    public static void main(String[] args) {
        if(args[0].equals("help")) {
            System.out.println("Area [shape] [parameter]");
            System.out.println("[shape]:\n1 for Rectangle\n2 for Triangle\n3 for Circle");
            System.out.println("[parameter]:\n2 for Triangle and Rectangle (Base and Height)\n1 for Circle (Radius)");
        } else if(args[0].equals("1") || args[0].equals("2")) {
            if(args.length != 3) {
                System.out.println("Missing required parameters check 'Area help'");
            } else {
                if(args[0].equals("1")) {
                    System.out.println("Area of Rectangle: " + new Rectangle().Area(new double[] {Double.parseDouble(args[1]), Double.parseDouble(args[2])}));
                } else {
                    System.out.println("Area of Triangle: " + new Triangle().Area(new double[] {Double.parseDouble(args[1]), Double.parseDouble(args[2])}));
                }
            }
        } else if(args[0].equals("3")) {
            if(args.length != 2) {
                System.out.println("Missing required parameters check 'Area help'");
            } else {
                 System.out.println("Area of Circle: " + new Circle().Area(new double[] {Double.parseDouble(args[1])}));
            }
        } else {
            System.out.println("Missing required parameters check 'Area help'");
        }
    }
}
