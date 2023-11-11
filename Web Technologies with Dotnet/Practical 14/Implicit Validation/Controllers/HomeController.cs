using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Implicit_Validation.Models;

namespace Implicit_Validation.Controllers;

public class HomeController : Controller
{
    [HttpPost]
    public IActionResult Index(Student student)
    {
        if (ModelState.IsValid)
        {
            return View("Index", student);
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
