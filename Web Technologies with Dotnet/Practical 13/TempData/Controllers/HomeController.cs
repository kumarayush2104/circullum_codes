using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using TempData.Models;

namespace TempData.Controllers;

public class HomeController : Controller
{

    [HttpPost]
    public IActionResult Index([FromForm] string message)
    {
        TempData["message"] = message;
        return RedirectToAction("Index");
    }

    public IActionResult Index()
    {
        string? message = TempData["message"] as string;
        return View("Index", message);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
