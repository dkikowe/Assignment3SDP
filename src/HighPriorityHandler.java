public class HighPriorityHandler extends TaskHandler {
    public void handleTask(Task task) {
        if (task.getPriority().equals("High")) {
            System.out.println("Handling high-priority task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
