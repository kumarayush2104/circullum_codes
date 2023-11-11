using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Practical_7.Models;

namespace Practical_7.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        Classroom classroom = new Classroom();
        Student student1 = new Student("Ayush", "253");
        classroom.addStudent(student1);
        classroom.addStudent(student1);
        classroom.addStudent(student1);
        classroom.addStudent(student1);
        classroom.getStudentCount();
        
        return View(classroom);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
