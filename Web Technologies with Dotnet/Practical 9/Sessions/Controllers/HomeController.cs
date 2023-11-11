using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Sessions.Models;

namespace Sessions.Controllers;

public class HomeController : Controller
{

    [HttpPost]
    public IActionResult Index([FromForm] string username)
    {
        HttpContext.Session.SetString("username", username);
        return RedirectToAction("Index");
    }

    public IActionResult Index()
    {
        string? name = HttpContext.Session.GetString("username");
        return View("Index", name);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
