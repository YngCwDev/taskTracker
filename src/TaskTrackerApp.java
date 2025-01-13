import filesys.TaskFileManager;


public class TaskTrackerApp {
    public static void main(String[] args) {

        TaskFileManager file = new TaskFileManager("userid", "taskdb");

        file.updateFileLine("id5, anything different, status, date");

    }

}