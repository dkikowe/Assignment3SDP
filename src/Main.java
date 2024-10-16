public class Main {
    public static void main(String[] args) {
        TaskHandler lowPriorityHandler = new LowPriorityHandler();
        TaskHandler mediumPriorityHandler = new MediumPriorityHandler();
        TaskHandler highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNextHandler(mediumPriorityHandler);
        mediumPriorityHandler.setNextHandler(highPriorityHandler);

        TaskMediator mediator = new TaskMediator(lowPriorityHandler);

        Task task1 = new Task("Fix bug", "Low");
        Task task2 = new Task("Implement feature", "Medium");
        Task task3 = new Task("Deploy to production", "High");

        mediator.addTask(task1);
        mediator.addTask(task2);
        mediator.addTask(task3);

        Command taskCommand1 = new TaskCommand(task1);
        Command taskCommand2 = new TaskCommand(task2);
        Command taskCommand3 = new TaskCommand(task3);

        mediator.addCommand(taskCommand1);
        mediator.addCommand(taskCommand2);
        mediator.addCommand(taskCommand3);

        mediator.executeAllCommands();

        TaskCollection taskCollection = new TaskCollection();
        taskCollection.addTask(task1);
        taskCollection.addTask(task2);
        taskCollection.addTask(task3);

        for (Task task : taskCollection) {
            System.out.println("Traversing task: " + task.getName());
        }
    }
}
