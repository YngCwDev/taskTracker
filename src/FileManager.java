import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;cr

public class FileManager {
    private File file;
    private String path;

    public FileManager(String fileName, String path) {
        this.path = path;
        this.file = new File(path + fileName + ".csv");
    }


    //Create a new file getting the name automatically...


    public void createFile() {
        try {
            if (file.createNewFile()) {
                System.out.println("File " + file.getName() + " is created successfully.");
            } else {
                System.out.println("File is already on the directory");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    /// /////////////////////////////////////////////
    public String getFileName() {
        return file.getPath();
    }


    /// ///////////////////////////////////
    public void writeOnFile() {

        try {
            FileWriter filewriter = new FileWriter(file);
            filewriter.write("id, description, status," + getTimeStamp());

            filewriter.close();
        } catch (IOException e) {
            System.out.println("Can't find the file!");
        }
    }

    public String getTimeStamp() {

        Date date = new Date();
        Timestamp tstamp = new Timestamp(date.getTime());
        return String.valueOf(tstamp);
    }

    @Override
    public String toString() {
        return getFileName();
    }
}


