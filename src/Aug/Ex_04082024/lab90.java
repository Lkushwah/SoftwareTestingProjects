package Aug.Ex_04082024;

public class lab90 {
    public static void main(String[] args) {
        ATBperson p1= new ATBperson();
        p1.name= "Laharsh Kushwah";
        p1.number= 98765431;

        System.out.println(p1.name);

        ATBperson p2 = new ATBperson();
        p2.name = "amit";
        p2.number = 86789351;

        System.out.println(p2.name);

        ATBperson p3 = new ATBperson("nigga");
        ATBperson p4 = new ATBperson("anuj",9854654);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);
        System.out.println(p3.number);
        System.out.println(p4.name);
        System.out.println(p4.number);
    }
}
