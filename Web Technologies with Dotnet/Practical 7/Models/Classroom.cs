namespace Practical_7;

public class Classroom
{
    public List<Student> students = new List<Student> { };


    public void addStudent(Student student)
    {
        students.Add(student);
    }

    public void getStudentCount()
    {
        Console.WriteLine(students.TotalStudents());
    }
}