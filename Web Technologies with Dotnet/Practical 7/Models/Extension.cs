namespace Practical_7;

public static class Extension  {
    public static int TotalStudents(this List<Student> students) {
        return students.Count;
    }
}