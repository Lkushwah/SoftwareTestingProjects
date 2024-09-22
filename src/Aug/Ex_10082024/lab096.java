package Aug.Ex_10082024;

public class lab096 {

    public static void main(String[] args) {

        ICICIbank A1 = new ICICIbank("laharsh", 1000);
        System.out.println(A1.getBalance());
        A1.setBalance(10000,true);
        A1.setName("amit",true);


    }
}
