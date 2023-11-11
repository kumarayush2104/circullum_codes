using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Query_Strings.Models;

namespace Query_Strings.Controllers;

public class HomeController : Controller
{
    public IActionResult Index([FromQuery(Name = "name")] string name)
    {
        return View("Index", name);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
