package July.ex_27072024;

import java.util.Scanner;

public class lab038 {
    public static void main(String args[]) {



        Scanner sc = new Scanner(System.in);
        System.out.println("how much you want to enter");
        int num = sc.nextInt();

        int[] marks = new int[4];

        for (int i =0; i <4; i++) {
            System.out.println("enter marks for "+ i +1);
            marks[i] = sc.nextInt();
        }

        float f = marks[0]+ marks[1]+marks[2]+marks[3]/ marks.length;





    }
}
