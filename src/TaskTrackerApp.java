import auth.User;
import filesys.TaskFileManager;


public class TaskTrackerApp {
    public static void main(String[] args) {
        // TaskFileManager userFile = new TaskFileManager("auth", "auth");


        User user = new User("Alcy", "1234");
        TaskFileManager taskFile = new TaskFileManager(user.getUserName(), "taskdb");
        TaskManager task = new TaskManager("AnyThing", "TODO", user, taskFile);


        task.createNewTask();
    }
}