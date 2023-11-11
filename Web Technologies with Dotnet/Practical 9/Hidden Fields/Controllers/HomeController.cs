using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Practical_9.Models;
using Task = Practical_9.Models.Task;

namespace Practical_9.Controllers;

public class HomeController : Controller
{
    [HttpPost]
    public IActionResult Index(Task task) {
       
        return View(task);
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
