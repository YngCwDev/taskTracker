import auth.User;
import filesys.TaskFileManager;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class TaskManager {
    private String taskId;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;
    private TaskFileManager taskFile;
    private User user;
    private String formatedTask;

    public TaskManager(String description, String status, User user, TaskFileManager taskFile) {
        this.taskId = "";
        this.description = description;
        this.status = status;
        this.createdAt = "-";
        this.updatedAt = "-";
        this.taskFile = taskFile;
        this.user = user;
        this.formatedTask = String.format("%s,%s,%s,%s, %s", this.taskId, this.description, this.status, this.createdAt, this.updatedAt);
    }

    public void createNewTask() {
        if (!(this.taskFile.checkFileExists())) {
            this.taskFile.createFile();
        }
        if (!(checkTaskExist())) {

            this.taskFile.writeANewLine(this.formatedTask);
        }
    }


    public void generateTaskId() {
        ArrayList<String> lines = this.taskFile.readFile();
        this.taskId = String.valueOf(lines.size());

    }

    public boolean checkTaskExist() {
        boolean exist = false;
        ArrayList<String> lines;
        lines = this.taskFile.readFile();

        for (String line : lines) {
            if (line == null) {
                continue;
            }
            String[] devide = line.split(",");
            if ((devide[0].equals(this.taskId))) {
                exist = true;
                break;
            }
        }

        return exist;
    }


    public void getTasksList() {
        ArrayList<String> lines = this.taskFile.readFile();

        for (String line : lines) {
            if (line == null) {
                continue;
            }
            System.out.println(line);

        }


    }

    public String getCreatedAt() {
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        this.createdAt = String.valueOf(time);
        return String.valueOf(time);
    }

    public String getUpdatedAt() {
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        this.updatedAt = String.valueOf(time);
        return String.valueOf(time);
    }

    public String toString() {
        return this.formatedTask;
    }
}