using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using Microsoft.EntityFrameworkCore;

namespace Practical_11;

class Product
{
    public int ProductId {get; set;}
    public string name { get; set; }
    public int quantity { get; set; }

    public int CategoryId {get; set;}
    public Category category { get; set; }

    public int SupplierId { get; set; }
    public Supplier supplier { get; set; }
}