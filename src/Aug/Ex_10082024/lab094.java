package Aug.Ex_10082024;

public class lab094 {

    public static void main(String[] args) {
        VWOlogin v1 = new VWOlogin("laharsh", "123");
        v1.username = "hello";
        System.out.println(v1.username);


    }

}
class VWOlogin{
    public String username;
    private String password;

    public VWOlogin (String username, String password){
        this.username = username;
        this.password = password;
    }

}