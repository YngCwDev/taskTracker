package auth;

import filesys.TaskFileManager;

public class User {
    private String userId;
    private String username;
    private String password;
    private String formatedUserData;
    private TaskFileManager usersFile;
    private Boolean logged;

    public User(){
        ;
    }
    public User(String name, String password) {
        this.userId = "1abcD";
        this.username = name;
        this.password = password;
        this.formatedUserData = this.userId + "," + username + "," + password;
        this.usersFile = new TaskFileManager("auth", "auth");
    }


    public void login() {
        this.logged = false;
        if (!(this.usersFile.checkFileExists())) {
            this.usersFile.createFile();
        }
        if (userExist()) {
            System.out.println("Welcome" + this.username + "\nYou logged in!");
            this.logged = true;
        }
    }

    public void createUser() {
        if(!logged){
            usersFile.writeANewLine(this.formatedUserData);
        }
    }

    public boolean userExist() {
        boolean exists = false;
        for (String line : usersFile.readFile()) {
            String[] userDetail = line.split(",");
            String fileUsername = userDetail[1];
            String filePassword = userDetail[2];
            if (this.username.equals(fileUsername) && this.password.equals(filePassword)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public String getUserName() {
        return username;
    }
    public String logOut(){
        return "logout";
    }

}

class TaskCypher {
    //soon
}
