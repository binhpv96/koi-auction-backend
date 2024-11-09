package fall24.swp391.g1se1868.koiauction.model;

public class UserRegister {
    private String userName;
    private String email;
    private String password;

    public UserRegister(String userName, String email, String password) {
        this.userName = userName;

        this.email = email;
        this.password = password;

    }

    public UserRegister() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

