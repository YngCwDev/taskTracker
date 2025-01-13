package auth;

import filesys.TaskFileManager;

public class Users {
    private String username;
    private String password;
    private String authFilePath;
    private TaskFileManager file;

    public Users(String name, String password) {
        this.username = name;
        this.password = password;
        this.file = new TaskFileManager("auth", "auth");
    }

    public void createUser(){

    }


}
