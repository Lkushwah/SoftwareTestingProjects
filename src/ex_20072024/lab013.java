package ex_20072024;

import java.util.Scanner;

public class lab013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter item code");
        int item = sc.nextInt();

        switch (item){
            case 001,002,003:
                System.out.println(item+ "not that other 1");break;
            case 006:
                System.out.println("this is the 1");break;
            default:
                System.out.println("Don't know what this is");
                break;

        }


    }
}
