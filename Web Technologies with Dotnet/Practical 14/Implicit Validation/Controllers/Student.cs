using System.ComponentModel.DataAnnotations;

namespace Implicit_Validation.Models;

public class Student {
    [Required(ErrorMessage = "Please enter your name")]
    [MinLength(3)]
    public required string Name {get; set;}
    [Required(ErrorMessage = "Invalid enrollment number")]
    [MinLength(15)]
    [MaxLength(15)]
    public required string Enroll {get; set;}
}