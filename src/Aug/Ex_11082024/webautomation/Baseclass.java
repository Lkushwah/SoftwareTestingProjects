package Aug.Ex_11082024.webautomation;

abstract class Baseclass extends Grandbaseclass {

    abstract String openbrowser(String Broweser);
    abstract String closebrowser(String Broweser);

    @Override
    void takescreenshot() {
        System.out.println("ss taken");
    }
}
