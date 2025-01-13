import auth.User;
import filesys.TaskFileManager;


public class TaskTrackerApp {
    public static void main(String[] args) {

        TaskFileManager file = new TaskFileManager("auth", "taskdb");

        User user = new User("YngCidw", "1234");
        System.out.println(user.userExist());
        user.login();
    }

}