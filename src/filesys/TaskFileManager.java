package filesys;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TaskFileManager {
    private final String fileName;
    private final String filePath;
    private final String rootPath;

    public TaskFileManager(String fileName, String filePath) {
        this.fileName = fileName + ".csv";
        this.filePath = filePath + "\\";
        this.rootPath = "C:\\Task Tracker\\";

    }

    public void createFile() {
        File newFile = new File(rootPath+filePath+fileName);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File Created successfully" + newFile.getName());
            } else {
                System.out.println("Can't create the file!");
            }

        } catch (IOException e) {
            System.out.println("Something wrong creating the file");
        }
    }


    //Create a new directory if it does'nt exists;
    public void createDirectory() {
        File newSubDir = new File(rootPath + filePath);
        ;
        File rootDir = new File(this.rootPath);

        //Create  app root directories if they don't  exists,
        if (!(newSubDir.exists() && rootDir.exists())) {
            if (rootDir.exists()) {

                if (!(newSubDir.exists())) {
                    if (newSubDir.mkdir()) {
                        System.out.println("Subdir created");
                    } else {
                        System.out.println("Subdir not created");
                    }
                } else {
                    System.out.println("Subdir already created");
                }
            } else {
                if (rootDir.mkdir()) {
                    System.out.println("Root dir created");
                } else {
                    System.out.println("root dir not created");
                }
                if (!(newSubDir.exists())) {
                    if (newSubDir.mkdir()) {
                        System.out.println("Subdir created");
                    } else {
                        System.out.println("Subdir not created");
                    }
                } else {
                    System.out.println("Drectory already created");
                }
            }
        } else  {
            System.out.println("They already exists!");
        }

    }


    public void writeANewLine() {

        try {
            FileWriter fWriter = new FileWriter(filePath + "\\" + fileName);
            fWriter.append("Hello");
            fWriter.close();
        } catch (IOException e) {
            System.out.println("Something is wrong!");
        }
    }
}


