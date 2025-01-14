import auth.User;
import filesys.TaskFileManager;


public class TaskTrackerApp {
    public static void main(String[] args) {
        User user = new User("Test", "1234");
        TaskFileManager userFile = new TaskFileManager("auth", "auth");
        TaskFileManager taskFile = new TaskFileManager(user.getUserName(), "taskdb");
        TaskManager task = new TaskManager("AnyThing", "TODO", user, taskFile);

    }
}