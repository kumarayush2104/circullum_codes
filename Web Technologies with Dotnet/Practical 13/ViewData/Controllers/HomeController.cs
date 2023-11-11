using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ViewData.Models;

namespace ViewData.Controllers;

public class HomeController : Controller
{
    public IActionResult Index()
    {
        ViewData["message"] = "Welcome to Microsoft ASP.NET's ViewData";
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
