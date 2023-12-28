package seminars.third.tdd;

public class User {

   private String name;
   private String password;

    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    public void setAuthenticate(boolean authenticate) {
        isAuthenticate = authenticate;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
    private boolean isAuthenticate = false;

    private boolean isAdmin = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;

    }

    public User(String name, String password,boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    //3.6.
    public boolean authenticate(String name, String password) {

       setAuthenticate(this.name == name && this.password == password);

        return isAuthenticate();
    }

}