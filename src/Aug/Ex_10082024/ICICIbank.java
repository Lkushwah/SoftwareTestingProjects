package Aug.Ex_10082024;

import java.sql.SQLOutput;

public class ICICIbank {

    public ICICIbank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    private String name;
    private long balance;


    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if(isAdmin == true){ this.name = name;
            System.out.println("admin updated the name");}
        else System.out.println("no access");
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAdmin) {
        if(isAdmin==true){
        this.balance = balance;
            System.out.println("admin access tru updated the bal");
        }
        else System.out.println("not allowed");

    }



}
