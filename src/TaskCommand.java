public class TaskCommand implements Command {
    private Task task;

    public TaskCommand(Task task) {
        this.task = task;
    }

    public void execute() {
        System.out.println("Executing task: " + task.getName());
    }
}
