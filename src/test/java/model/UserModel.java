package model;

public class UserModel {

    public UserModel(String name, String email, String password, String job) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.job = job;
    }

    private String name;
    private String email;
    private String job;
    private String password;
}
