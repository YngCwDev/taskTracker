import filesys.TaskFileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;


public class TaskTrackerApp {
    public static void main(String[] args) {

        TaskFileManager file = new TaskFileManager("userid", "taskdb");
        file.writeANewLine("id3, desc, status, date");

    }
}