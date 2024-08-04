package July.ex_21072024;

import javax.xml.transform.Source;
import java.util.Scanner;

public class lab020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);System.out.println("enter number for even odd");
        int b = sc.nextInt();

        for (int a = 0; a <=b ; a++) {
            if(a%2==0){
                System.out.println(a+"is even");
            }
        }
        for (int i = 0; i < b; i++) {
            if (i%3==0) {
                System.out.println(i+ "is odd");

            }
        }

    }

}
