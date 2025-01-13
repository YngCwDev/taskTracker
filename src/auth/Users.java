package auth;

import filesys.TaskFileManager;

public class Users {
    private String username;
    private String password;
    private String authFilePath;
    private TaskFileManager usersFile;

    public Users(String name, String password) {
        this.username = name;
        this.password = password;
        this.usersFile = new TaskFileManager("auth", "auth");
    }

    public void createUser(){

    }


}
