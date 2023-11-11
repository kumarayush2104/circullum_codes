namespace Practical_6.Controllers;

public class HomeController : Controller
{
    public IActionResult Index()
    {
        Manager manager = new Manager("Ayush Kumar", 21, null, "IT");
        return View(manager);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
