// Ayush Kumar
// 202103103510253 (20)
// CS-1

interface Java {
    public void javaData();
}

interface Python {
    public void pythonData();
}

class Subject implements Java, Python {
    String name;
    String enroll;
    String pythonProfessor;
    String pythonGrade;
    String javaProfessor;
    String javaGrade;

    public Subject(String name, String enroll, String pyProf, String pyGrade, String javaProf, String javaGrade) {
        this.name = name;
        this.enroll = enroll;
        this.pythonProfessor = pyProf;
        this.javaProfessor = javaProf;
        this.pythonGrade = pyGrade;
        this.javaGrade = javaGrade;
    }

    public void javaData() {
        System.out.println("\nSubject: Java\nJava's Professor Name: " + this.pythonProfessor + "\nJava's Grade: " + this.pythonGrade);
    }

    public void pythonData() {
        System.out.println("\nSubject: Python\nPython's Professor Name: " + this.javaProfessor + "\nPython's Grade: " + this.javaGrade);
    }

    public void display() {
        System.out.println("Name:" + this.name + "\nEnrollment Number: " + this.enroll);
        javaData();
        pythonData();
    }
}

class Program12 {
    public static void main(String[] args) {
        Subject stu1  = new Subject("Ayush Kumar", "202103103510253", "Vishvajit Bakrola", "A", "Kavindra Patel", "A");
        stu1.display();
    }
}