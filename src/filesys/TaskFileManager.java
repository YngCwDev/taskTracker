package filesys;

import java.io.*;

import java.util.ArrayList;

public class TaskFileManager {
    private String fileName;
    private String filePath;
    private String rootPath;
    private String file;


    public TaskFileManager() {
        return;
    }

    public TaskFileManager(String fileName, String filePath) {
        this.fileName = fileName + ".csv";
        this.filePath = filePath + "\\";
        this.rootPath = "C:\\Task Tracker\\";
        this.file = this.rootPath + this.filePath + this.fileName;

    }


    public void createFile() {
        File newFile = new File(rootPath + filePath + fileName);
        try {
            if (!(newFile.exists())) {
                if (newFile.createNewFile()) {
                    System.out.println("File Created successfully");
                } else {
                    System.out.println("Can't create the file!");
                }
            } else {
                System.out.println("File already created!");
            }

        } catch (IOException e) {
            System.out.println("Something wrong creating the file");
        }
    }


    //Create a new app directories if they dont  exist;
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
        } else {
            System.out.println("They already exists!");
        }

    }


    //Append lines of string to the file;
    public void writeANewLine(String newLine) {

        try {
            BufferedWriter fWriter = new BufferedWriter(new FileWriter(this.file, true));
            fWriter.append(newLine);
            fWriter.newLine();
            fWriter.close();
        } catch (IOException e) {
            System.out.println("Something is wrong!");
        }
    }

    public void updateFileLine(String updatedLine) {
        ArrayList<String> currentFileLines = this.readFile();

        try {
            BufferedWriter fWriter = new BufferedWriter(new FileWriter(this.file));
            for (String line : currentFileLines) {
                String[] lineId = line.split(",");
                String[] updateLineId = updatedLine.split(",");
                if (lineId[0].equals(updateLineId[0])) {
                    line = updatedLine;
                }
                fWriter.write("");
                writeANewLine(line)all;
            }
            fWriter.close();

        } catch (IOException e) {
            System.out.println("Something is wrong writing update!" + e.getMessage());
        }


    }


    //Read text files content line by line then return in an array
    public ArrayList<String> readFile() {

        ArrayList<String> fileLines = new ArrayList<>();

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(this.file));
            String line;
            while ((line = fileReader.readLine()) != null) {

                fileLines.add(line);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fileLines;
    }
}



