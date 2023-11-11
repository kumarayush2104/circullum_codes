using System.ComponentModel.DataAnnotations;

namespace Explicit_Validation.Models;

public class Employee {
    public required string Name {get; set;}
    public required int Age {get; set;}
}