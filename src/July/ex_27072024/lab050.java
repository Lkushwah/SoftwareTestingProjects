package July.ex_27072024;

import java.util.Scanner;

public class lab050 {

    public static void main(String[] args) {
        System.out.println("scanner input ");
        Scanner sc = new Scanner(System.in);

        int[][] array_2d = new int[2][2];
        System.out.println(array_2d.length);

        for (int i = 0; i <array_2d.length; i++) {
            System.out.println("enter value for" +array_2d[0][i]);
            array_2d[0][i] = sc.nextInt();

            System.out.println("entered value"+array_2d[0][i]);

        }
        for (int j = 0; j <array_2d.length; j++) {
            System.out.println("enter value for" +array_2d[1][j]);
            array_2d[1][j] = sc.nextInt();

            System.out.println("entered value"+array_2d[1][j]);

        }

        System.out.print(array_2d[0][0]);
        System.out.println(array_2d[0][1]);
        System.out.print(array_2d[1][0]);
        System.out.println(array_2d[1][1]);

        sc.close();
        }
    }

