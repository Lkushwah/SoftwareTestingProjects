package Aug.Ex_04082024;

public class BankAccount {

    String Bankname;
    long account;
    String Bankcode;

     BankAccount() {
         Bankname = "SBI";
        account = 0;
        Bankcode = "SBI001";

}
    BankAccount(String Bankname, String Bankcode, long account) {
        this.Bankname = Bankname;
        this.account = account;
        this.Bankcode = Bankcode;

    }



    void printdetails(){
        System.out.println("Bank Name ->" +Bankname);
        System.out.println("Bankaccount ->" +account);
        System.out.println("Bankcode ->" +Bankcode);

    }
}
