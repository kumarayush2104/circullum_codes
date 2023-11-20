using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Response_cache.Models;

namespace Response_cache.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

   
    [HttpGet]
    [ResponseCache(Duration = 180, Location = ResponseCacheLocation.Any)]
    public IActionResult Index()
    {
        return View("Index", $"Responses are generated on {DateTime.Now}");
    }

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
