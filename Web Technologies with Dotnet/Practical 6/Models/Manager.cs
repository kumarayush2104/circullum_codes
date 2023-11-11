namespace Practical_6.Models;

class Manager : Employee
{
    public string department { get; set; }
    public Manager(string name, int age, string? address, string department) : base(name, age, address)
    {
        this.department = department;
    }
}