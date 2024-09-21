package Aug.Ex_04082024;

import java.util.Scanner;

public class lab092 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int account = sc.nextInt();
        String code = sc.next();

        BankAccount b1 = new BankAccount(name, code, account);
        System.out.println(b1.Bankcode);
        System.out.println(b1.Bankname);
        System.out.println(b1.account);
        b1.printdetails();
    }

}
