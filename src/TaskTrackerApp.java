import auth.User;
import filesys.TaskFileManager;


public class TaskTrackerApp {
    public static void main(String[] args) {

        TaskFileManager file = new TaskFileManager("auth", "taskdb");

        User user = new User("Alcides", "1234");
        user.login();
    }

}