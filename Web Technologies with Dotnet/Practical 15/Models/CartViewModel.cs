namespace Practical_15.Models;

public class CartViewModel
{
    public CartItem CartItem { get; set; }
    public IEnumerable<CartItem> CartItems { get; set; }
}