package ex_21072024;

import java.util.Scanner;

public class lab031 {
    public static void main(String[] args) {
        //leap year
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year %4 == 0){
            System.out.println(year+ "is a leap year");}

    }
}
