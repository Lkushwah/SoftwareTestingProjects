package Aug.Ex_04082024;

public class lab091 {

    public static void main(String[] args) {

        BankAccount b1= new BankAccount();
        System.out.println(b1.Bankcode);
        System.out.println(b1.Bankname);
        System.out.println(b1.account);

        BankAccount b2 = new BankAccount("icici","icici123",478945);
        System.out.println(b2.Bankcode);
        System.out.println(b2.Bankname);
        System.out.println(b2.account);


    }
}
