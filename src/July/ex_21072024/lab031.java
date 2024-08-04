package July.ex_21072024;

import java.util.Scanner;

public class lab031 {
    public static void main(String[] args) {
        //leap year
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println("leap year");
            }

        }
    }
}