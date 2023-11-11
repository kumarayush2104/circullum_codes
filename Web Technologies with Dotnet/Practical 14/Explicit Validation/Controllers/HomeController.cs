using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Explicit_Validation.Models;

namespace Explicit_Validation.Controllers;

public class HomeController : Controller
{
    [HttpPost]
    public IActionResult Index(Employee employee)
    {
        if (employee.Age > 60)
        {
            ModelState.AddModelError("Age", "Invalid employee age");
        }
        return View();
    }

    public IActionResult Index()
    {
        return View();
    }


    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
