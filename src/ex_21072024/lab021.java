package ex_21072024;

import javax.xml.transform.Source;
import java.util.Scanner;

public class lab021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);System.out.println("enter number for even odd");
        int b = sc.nextInt();

        for (int a = 0; a <=b ; a++) {
            if(a%3==0){
                System.out.println(a+"is odd");
            }
        }



    }

}
