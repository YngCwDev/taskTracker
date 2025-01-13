import java.sql.Timestamp;
import java.util.Date;

public class TaskManager {
    private String taskId;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;

    public TaskManager(String description, String status) {
        this.taskId = "xxxx";
        this.description = description;
        this.status = status;
        this.createdAt = "";
        this.updatedAt = "";
    }

    public void newTask(){

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
