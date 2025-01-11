import filesys.TaskFileManager;


public class TaskTrackerApp {
    public static void main(String[] args) {

TaskFileManager file = new TaskFileManager("auth",  "taskdb");

    file.createDirectory();
    }
}