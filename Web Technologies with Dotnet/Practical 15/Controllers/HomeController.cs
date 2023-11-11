using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Practical_15.Models;

namespace Practical_15.Controllers;

public class HomeController : Controller
{
    private CartDatabaseContext cartDatabaseContext;

    public HomeController()
    {
        cartDatabaseContext = new CartDatabaseContext();
    }

    [HttpPost]
    public IActionResult AddData(CartItem cartItem)
    {
        cartDatabaseContext.Add(cartItem);
        cartDatabaseContext.SaveChanges();
        return RedirectToAction("Index");
    }

    public IActionResult DeleteData(int itemId)
    {
        try
        {
            CartItem? item = cartDatabaseContext.Items.Where(item => item.CartItemId == itemId).First();
            if (item != null)
            {
                cartDatabaseContext.Remove(item);
                cartDatabaseContext.SaveChanges();
            }
        }
        catch { }
        return RedirectToAction("Index");
    }

    [HttpPost]
    public IActionResult UpdateData(CartItem cartItem)
    {
        try
        {
            CartItem? item = cartDatabaseContext.Items.Where(item => item.CartItemId == cartItem.CartItemId).First();
            if (item != null)
            {
                item.Name = cartItem.Name;
                item.Quantity = cartItem.Quantity;
                cartDatabaseContext.SaveChanges();
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
        return RedirectToAction("Index");
    }

    [HttpGet]
    public IActionResult Index()
    {
        CartViewModel cartViewModel = new CartViewModel
        {
            CartItems = cartDatabaseContext.Items.ToList()
        };
        return View(cartViewModel);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
