public class User {
    private int user_ID;
    private String username;
    private String email;
    private boolean admin;
    private String password;

    public User(int user_ID, String email, String username, String password) {
        this.user_ID = user_ID;
        this.username = username;
        this.email = email;
        this.admin = false;
        this.password = password;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
