import auth.User;
import filesys.TaskFileManager;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

public class TaskManager {
    private String taskId;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;

    private TaskFileManager taskFile;
    private User user;

    private String formatedTask = String.format("%s,%s,%s,%s, %s",
            this.taskId,
            this.description,
            this.status,
            this.createdAt,
            this.updatedAt);

    public TaskManager(String description, String status, User user, TaskFileManager taskFile) {
        this.taskId = "xxxx";
        this.description = description;
        this.status = status;
        this.createdAt = getCreatedAt();
        this.updatedAt = getUpdatedAt();
        this.taskFile = taskFile;
        this.user = user;
    }

    public void createNewTask() {
        if (!(this.taskFile.checkFileExists())) {
            this.taskFile.createFile();
        }


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

    public String generateTaskId() {
        Random random = new Random();
        String taskId = String.valueOf(random.nextInt(100, 1000));

        return taskId;
    }

    public boolean checkTaskExist(String currentTaskId) {
        boolean exist = false;
        for (String line : this.taskFile.readFile()) {
            String[] devide = line.split(",");
            if ((devide[0].equals(currentTaskId))) {
                exist = true;
            }
        }
        return exist;
    }

    public String toString() {
        return String.format("%s,%s,%s,%s, %s",
                this.taskId,
                this.description,
                this.status,
                this.createdAt,
                this.updatedAt);
    }
}
