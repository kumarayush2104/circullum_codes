namespace Practical_6.Models;

class Employee
{
    public string name { get; set; }
    public int age { get; set; }
    public string? address { get; set; }

    public Employee(string name, int age, string? address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}