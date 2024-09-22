package Aug.Ex_10082024;

public class lab095 {

    public static void main(String[] args) {
        VWOlogin1 v1 = new VWOlogin1("laharsh", "123");

        System.out.println(v1.getUsername());
        v1.setUsername("");
        System.out.println(v1.getUsername());
    }

}
class VWOlogin1{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public VWOlogin1(String username, String password){
        this.username = username;
        this.password = password;
    }

}