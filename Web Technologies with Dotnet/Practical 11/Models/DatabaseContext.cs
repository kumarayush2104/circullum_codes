using Microsoft.Data.SqlClient;
using Microsoft.EntityFrameworkCore;

namespace Practical_11;

class DatabaseContext : DbContext
{
    public DbSet<Product> products { get; set; }
    public DbSet<Supplier> suppliers { get; set; }
    public DbSet<Category> categories { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        var builder = new SqlConnectionStringBuilder(@"Data Source=localhost;Database=MarketPlace;Integrated Security=sspi;");
        builder.Encrypt = true;
        builder.TrustServerCertificate = true;

        optionsBuilder.UseSqlServer(builder.ConnectionString);
    }

     protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Product>()
                .HasOne(p => p.category)
                .WithMany(c => c.Products)
                .HasForeignKey(p => p.CategoryId);

            modelBuilder.Entity<Product>()
                .HasOne(p => p.supplier)
                .WithMany(s => s.products)
                .HasForeignKey(p => p.SupplierId);
        }
}