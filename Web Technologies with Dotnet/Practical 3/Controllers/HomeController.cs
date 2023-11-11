using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Practical_3.Models;

namespace Practical_3.Controllers;

public class HomeController : Controller
{
    public IActionResult Index()
    {
        DateTime datetime = DateTime.Now;
        if(datetime.Hour >= 6 && datetime.Hour < 12) {
            return View("Index", "Good Morning");
        } else if(datetime.Hour >= 12 && datetime.Hour < 16) {
            return View("Index", "Good Afternoon");
        } else if(datetime.Hour >= 17 && datetime.Hour < 20) {
            return View("Index", "Good Evening");
        }

        return View("Index", "Good Night");
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
