package July.ex_27072024;

import java.util.Scanner;

public class lab035 {
    public static void main(String[] args) {
        int[] marks = new int[4];
        Scanner sc = new Scanner(System.in);
        marks[0] = 90;
        marks[1] = 91;
        marks[2] = 92;
        marks[3] = 93;
        System.out.println(marks[3]+"" +marks[2]+""+marks[1] );
        System.out.println("enter 0");
        marks[0] = sc.nextInt();System.out.println("enter 1");

        marks[1] = sc.nextInt();System.out.println("enter 2");
        marks[2] = sc.nextInt();System.out.println("enter 3");
        marks[3] = sc.nextInt();



    }

}
