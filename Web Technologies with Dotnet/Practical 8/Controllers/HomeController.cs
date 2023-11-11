using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Practical_8.Models;

namespace Practical_8.Controllers;

public class HomeController : Controller
{
    private async Task<string?> getData()
    {
        HttpClient client = new HttpClient();
        var httpMessage = await client.GetAsync("https://dummyjson.com/users");
        var message = await httpMessage.Content.ReadAsStringAsync();
        return message;
    }

    public async Task<ViewResult> Index()
    {
        var message = await getData();
        return View("Index", message);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
