package auth;

import filesys.TaskFileManager;

public class User {
    private String userId;
    private String username;
    private String password;
    private String formatedUserData;
    private TaskFileManager usersFile;

    public User(String name, String password) {
        this.userId = "1abcD";
        this.username = name;
        this.password = password;
        this.formatedUserData = this.userId + ", " + username + ", " + password;
        this.usersFile = new TaskFileManager("auth", "auth");
    }

    public void login() {
        if (!(this.usersFile.checkFileExists())) {
            this.usersFile.createFile();
        }
        if(userExist()){
            System.out.println("You logged in!");
        }

    }

    public boolean userExist() {
        boolean exists = false;
        for(String line : usersFile.readFile()){
            String[] user = line.split(",");
            String fileUsername = user[1];
            String filePassword = user[2];
            if(this.username.equals(fileUsername) && this.password.equals(filePassword)){
                exists = true;
            }

        }

        return exists;
    }



}
