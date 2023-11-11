namespace Practical_12.Models;

public class Task {
    public int TaskId { get; set; }
    public required string TaskName { get; set; }
    public bool IsCompleted { get; set; } = false;
    public required DateTime Deadline { get; set; }
}