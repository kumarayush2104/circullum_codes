using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ViewBag.Models;

namespace ViewBag.Controllers;

public class HomeController : Controller
{
    public IActionResult Index()
    {
        ViewBag.message = "Welcome to ASP dotnet's ViewBag";
        return View();
    }


    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
