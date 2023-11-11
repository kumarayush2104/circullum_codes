namespace Practical_6.Models;

class Clerk : Employee
{
    public string department { get; set; }
    public string shift { get; set; }
    public Clerk(string name, int age, string? address, string department, string shift) : base(name, age, address)
    {
        this.shift = shift;
        this.department = department;
    }
}