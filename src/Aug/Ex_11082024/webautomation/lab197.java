package Aug.Ex_11082024.webautomation;

public class lab197 {
    public static void main(String[] args) {

        chrome c = new chrome();
        c.openbrowser("chrome");
        c.closebrowser("chrome");
        c.takescreenshot();

    }
}
