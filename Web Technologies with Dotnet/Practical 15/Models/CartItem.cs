namespace Practical_15.Models;

public class CartItem
{
    public int CartItemId { get; set; }
    public required string Name { get; set; }
    public int Quantity { get; set; }
}