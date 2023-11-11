using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Caching.Memory;
using Practical_10.Models;

namespace Practical_10.Controllers;

public class HomeController : Controller
{
    private readonly IMemoryCache memoryCache;

    public HomeController(IMemoryCache memoryCache)
    {
        this.memoryCache = memoryCache;
    }

    [HttpPost]
    public IActionResult Index([FromForm] string username)
    {
        var cacheOptions = new MemoryCacheEntryOptions().SetSlidingExpiration(TimeSpan.FromSeconds(30));
        memoryCache.Set("name", username, cacheOptions);
        return RedirectToAction("Users");
    }

    public ViewResult Index()
    {
        return View();
    }

    public IActionResult Users()
    {
        memoryCache.TryGetValue("name", out string? name);
        return View("Users", name ?? "Guest");
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
