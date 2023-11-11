using Microsoft.Data.SqlClient;
using Microsoft.EntityFrameworkCore;

namespace Practical_12.Models;

public class TaskDatabaseContext : DbContext
{
    public DbSet<Task> GetTasks { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        SqlConnectionStringBuilder sqlConnectionStringBuilder = new(@"Data Source=localhost;Database=TaskManager;Integrated Security=sspi;")
        {
            Encrypt = true,
            TrustServerCertificate = true
        };
        optionsBuilder.UseSqlServer(sqlConnectionStringBuilder.ConnectionString);
    }
}