using System.ComponentModel.DataAnnotations;
using Microsoft.EntityFrameworkCore;

namespace Practical_11;

class Supplier
{
    public int SupplierId { get; set; }
    public string name { get; set; }
    public string address { get; set; }
    public IEnumerable<Product> products { get; set; }
}