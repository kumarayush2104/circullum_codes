using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Practical_4.Models;

namespace Practical_4.Controllers;

public class HomeController : Controller
{
    public IActionResult Index()
    {
        return View();
    }

    public ViewResult Welcome()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
