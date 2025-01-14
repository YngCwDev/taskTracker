import auth.User;
import filesys.TaskFileManager;

import java.sql.Timestamp;
import java.util.Date;

public class TaskManager {
    private String taskId;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;

    private TaskFileManager taskFile;
    private User user;


    public TaskManager(String description, String status, User user, TaskFileManager taskFile) {
        this.taskId = "xxxx";
        this.description = description;
        this.status = status;
        this.createdAt = "";
        this.updatedAt = "";
        this.taskFile = taskFile;
        this.user = user;
    }

    public void newTask() {
        taskFile.createFile();
    }

    public String getCreatedAt() {
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        return String.valueOf(time);
    }

    public String getUpdatedAt() {
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        return String.valueOf(time);
    }
}
