using Microsoft.Data.SqlClient;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;

namespace Practical_15.Models;

public class CartDatabaseContext : DbContext
{
    public DbSet<CartItem> Items { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        SqlConnectionStringBuilder builder = new(@"Data Source=localhost;Database=Cart;Integrated Security=sspi;")
        {
            Encrypt = true,
            TrustServerCertificate = true
        };

        optionsBuilder.UseSqlServer(builder.ConnectionString);
    }
}