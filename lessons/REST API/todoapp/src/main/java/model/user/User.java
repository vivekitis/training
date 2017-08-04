package model.user;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private long userId = -1;
    private String userName = "";
    private String password = "";
    private String emailId = "";
    private String phone = "";

    public User(long userId, String userName, String password, String emailId, String phone) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
        this.phone = phone;
    }

    @JsonCreator
    public User(@JsonProperty("username") String username, @JsonProperty("password") String password,
                @JsonProperty("email") String email, @JsonProperty("phone") String phone){
        this.userName = username;
        this.password = password;
        this.emailId = email;
        this.phone = phone;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
