package July.ex_27072024;

import java.util.Scanner;

public class lab039 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how much you want to enter");
        int num = sc.nextInt();

        float[] marks = new float[ num];

        for (int i =0; i < num ; i++) {

            System.out.println("enter marks for "+ (i +1));
            marks[i] = sc.nextInt();

        }

        float sum = 0;

        for (int i = 0; i<num;i++){
            sum +=marks[i];
        }

        float f = sum/num;
        System.out.println("avg value"+f);



    }
}
