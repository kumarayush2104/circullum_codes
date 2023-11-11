using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Cookies.Models;

namespace Cookies.Controllers;

public class HomeController : Controller
{
    [HttpPost]
    public IActionResult Index([FromForm] string username)
    {
        Response.Cookies.Append("username", username);
        return RedirectToAction("Index");
    }

    public IActionResult Index()
    {
        string? name = Request.Cookies["username"];
        return View("Index", name);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
