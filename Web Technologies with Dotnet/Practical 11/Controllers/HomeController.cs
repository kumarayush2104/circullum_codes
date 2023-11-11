using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Practical_11.Models;

namespace Practical_11.Controllers;

public class HomeController : Controller
{
    public IActionResult Index()
    {
        using (DatabaseContext databaseContext = new DatabaseContext())
        {
            Category category = new Category { Name = "Laptops" };
            Supplier supplier = new Supplier { name = "HP Inc.", address = "Gurugram" };

            databaseContext.categories.Add(category);
            databaseContext.suppliers.Add(supplier);
            databaseContext.products.Add(new Product
            {
                name =
            "HP Gaming Laptop",
                quantity = 10,
                SupplierId = 1,
                CategoryId = 1
            });
            databaseContext.SaveChanges();
        }
        return View();
    }

    public IActionResult Products()
    {
        DatabaseContext databaseContext = new DatabaseContext();

        List<Product> list = databaseContext.products.Include(p => p.supplier).Include(p => p.category).ToList();

        return View(list);
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}