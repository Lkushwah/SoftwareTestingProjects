package July.ex_27072024;

import java.util.Scanner;

public class lab047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float marks[] = new float[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextFloat();
            System.out.println("entered marks" + marks[i]);

            sc.close();
        }




    }
}
