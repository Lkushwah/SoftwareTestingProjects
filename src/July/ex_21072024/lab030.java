package July.ex_21072024;

import java.util.Scanner;

public class lab030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i <a ; i++) {

            if (i%3 == 0 && i%5==0){
                System.out.println(i+"fizzbuzz");
            }

            if (i%3 == 0) {
                System.out.println("fizz");
            }
            else if (i%5 == 0) {
                System.out.println("buzz");
            }
            else System.out.println(i);
        }
    }
}
