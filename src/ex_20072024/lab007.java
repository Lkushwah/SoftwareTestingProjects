package ex_20072024;

import java.util.Scanner;

public class lab007 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("emter any number ");
        int user_input = sc.nextInt();

        if(user_input%2 == 0){
            System.out.println("number is even");
        }
        else System.out.println("odd");
    }
}
