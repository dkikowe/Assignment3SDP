public class LowPriorityHandler extends TaskHandler {
    public void handleTask(Task task) {
        if (task.getPriority().equals("Low")) {
            System.out.println("Handling low-priority task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
