import filesys.TaskFileManager;

import java.nio.file.Path;


public class TaskTrackerApp {
    public static void main(String[] args) {

        TaskFileManager file = new TaskFileManager("auth", "auth");
        file.createDirectory();
        file.createFile();
    }

}