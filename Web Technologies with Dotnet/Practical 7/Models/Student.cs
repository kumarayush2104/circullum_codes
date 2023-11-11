namespace Practical_7;

public class Student
{
    public string name;
    public string enrollmentNumber;
    public List<Student> students = new List<Student> { };

    public Student(string name, string enrollmentNumber)
    {
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
    }
}