package July.ex_20072024;

import java.util.Scanner;

public class lab010 {
    public static void main(String[] args) {

        //  1 monday enter number show day

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for the day");
        int day = sc.nextInt();

        switch (day){

            case 1:
                System.out.println("MOnday");
                break;

           case 2:
                System.out.println("Tuesday");break;
           case 3:
                System.out.println("Wednesday");break;
           case 4:
                System.out.println("Thrusday");break;
           case 5:
                System.out.println("Friday");break;
           case 6:
                System.out.println("Saturday");break;
           case 7:
                System.out.println("Sunday");

           default:
               System.out.println("no idea what is this");

        }
        System.out.println("loop out");

    }
}
