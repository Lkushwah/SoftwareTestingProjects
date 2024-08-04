package July.ex_27072024;

import java.util.Scanner;

public class lab038 {
    public static void main(String args[]) {



        Scanner sc = new Scanner(System.in);
        System.out.println("how much you want to enter");
        float num = sc.nextFloat();

        float[] marks = new float[4];

        for (int i =0; i < marks.length; i++) {

            System.out.println("enter marks for "+ (i +1));
            marks[i] = sc.nextInt();

        }

        float f = marks[0]+ marks[1]+marks[2]+marks[3]/ marks.length;
        System.out.println("avg value"+f);




    }
}
