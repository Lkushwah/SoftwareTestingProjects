package ex_20072024;

import java.util.Scanner;

public class lab011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name ");
        String day = sc.next();

        switch (day){

            case "Chrome":
                System.out.println("starting Chrome");
                break;
            case "Firefox":
                System.out.println("starting Firefox");
                break;
            case "Safari":
                System.out.println("starting Safari");
                break;

            default:
                System.out.println("no idea what is this");

        }
        System.out.println("loop out");
    }

}
