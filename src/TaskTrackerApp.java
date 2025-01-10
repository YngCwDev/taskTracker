public class TaskTrackerApp {
    public static void main(String[] args) {
        String path = "C:\\Users\\Alcy_DevMode\\Desktop\\Projects\\TaskTracker\\taskTracker\\src\\taskdb\\";
        FileManager file = new FileManager("NewFileTest2", path);

        file.writeOnFile();
    }
}