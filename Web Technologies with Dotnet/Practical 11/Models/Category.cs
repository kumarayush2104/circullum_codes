using System.ComponentModel.DataAnnotations;
namespace Practical_11;

class Category
    {
        public int CategoryId { get; set; }
        public string Name { get; set; }
        public ICollection<Product> Products { get; set; }
    }