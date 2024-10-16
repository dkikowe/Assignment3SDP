import java.util.ArrayList;
import java.util.List;

public class TaskMediator {
    private TaskHandler handler;
    private List<Command> commands = new ArrayList<>();

    public TaskMediator(TaskHandler handler) {
        this.handler = handler;
    }

    public void addTask(Task task) {
        handler.handleTask(task);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeAllCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
