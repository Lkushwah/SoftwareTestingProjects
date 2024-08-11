package July.ex_28072024;

public class lab056 {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.name = "ICICI";
        bank.customerAccountnumber = 21456879;
        bank.IFSC_Code = "ICICI_050";

        bank.Createaccount();
        bank.settingupdated();

        System.out.println(bank.name);
        System.out.println(bank.customerAccountnumber);
        System.out.println(bank.IFSC_Code);


        Bank bank1 = new Bank();

        bank1.name = "SBI";
        bank1.customerAccountnumber = 64654;
        bank1.IFSC_Code = "SBI_354";

        bank1.Createaccount();
        bank1.settingupdated();

        System.out.println(bank1.name);
        System.out.println(bank1.customerAccountnumber);
        System.out.println(bank1.IFSC_Code);
    }

}
