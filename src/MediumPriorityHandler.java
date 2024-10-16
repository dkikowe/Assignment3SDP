public class MediumPriorityHandler extends TaskHandler {
    public void handleTask(Task task) {
        if (task.getPriority().equals("Medium")) {
            System.out.println("Handling medium-priority task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
