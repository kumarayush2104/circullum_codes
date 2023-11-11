using Microsoft.AspNetCore.Mvc;
using Practical_12.Models;
using Task = Practical_12.Models.Task;

namespace Practical_12;

[ApiController]
[Route("[controller]")]
public class TaskManagerController : ControllerBase
{
    TaskDatabaseContext _taskDatabaseContext;
    public TaskManagerController()
    {
        _taskDatabaseContext = new TaskDatabaseContext();
    }

    [HttpGet("tasks", Name = "Get all tasks")]
    [Produces("application/json")]
    public IActionResult GetTasks()
    {
        try
        {
            List<Task> tasks = _taskDatabaseContext.GetTasks.ToList();
            return new JsonResult(new { success = true, message = tasks });
        }
        catch (Exception ex)
        {
            return new JsonResult(new { success = false, message = ex.Message });
        }
    }

    [HttpGet("task/{TaskId}", Name = "Get a specific task")]
    [Produces("application/json")]
    public IActionResult GetTask(int TaskId)
    {
        try
        {
            Task? task = _taskDatabaseContext.GetTasks.Where(task => task.TaskId == TaskId).First();
            if (task == null)
            {
                throw new Exception("Task not found");
            }
            else
            {
                return new JsonResult(new { success = true, message = task });
            }
        }
        catch (Exception ex)
        {
            return new JsonResult(new { success = false, message = ex.Message });
        }
    }

    [HttpPost("task", Name = "Create a new task")]
    [Consumes("application/json")]
    [Produces("application/json")]
    public IActionResult CreateTask(Task task)
    {
        try
        {
            _taskDatabaseContext.Add(task);
            _taskDatabaseContext.SaveChanges();

            return new JsonResult(new { success = true, message = $"{task.TaskName} created successfully !" });
        }
        catch (Exception ex)
        {
            return new JsonResult(new { success = false, message = ex.Message });
        }
    }

    [HttpPatch("task/{TaskId}", Name = "Update task status")]
    [Consumes("application/json")]
    [Produces("application/json")]

    public IActionResult UpdateTask(int TaskId, bool completionStatus)
    {
        try
        {
            Task? selectedTask = _taskDatabaseContext.GetTasks.Where(task => task.TaskId == TaskId).First();
            if (selectedTask == null)
            {
                throw new Exception("Task not found");
            }
            else
            {
                selectedTask.IsCompleted = completionStatus;
                _taskDatabaseContext.SaveChanges();
                return new JsonResult(new { success = true, message = $"{selectedTask.TaskName}'s status updated successfully" });
            }
        }
        catch (Exception ex)
        {
            return new JsonResult(new { success = false, message = ex.Message });
        }
    }

    [HttpDelete("task/{TaskId}", Name = "Delete a task")]
    [Produces("application/json")]

    public IActionResult DeleteTask(int TaskId)
    {
        try
        {
            Task? selectedTask = _taskDatabaseContext.GetTasks.Where(task => task.TaskId == TaskId).First();
            if (selectedTask == null)
            {
                throw new Exception("Task not found");
            }
            else
            {
                _taskDatabaseContext.Remove(selectedTask);
                _taskDatabaseContext.SaveChanges();
                return new JsonResult(new { success = true, message = $"{selectedTask.TaskName}'s deleted successfully" });
            }
        }
        catch (Exception ex)
        {
            return new JsonResult(new
            {
                success = false,
                message = ex.Message
            });

        }
    }
}