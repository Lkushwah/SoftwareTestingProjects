package July.ex_27072024;

public class righttriangestar {

    public static void main(String[] args) {
        String star = "*";
        for (int i = 0; i <4 ; i++) {
            System.out.println(star);
        star =star+"*";

        }
        int n =5;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <=j ; i++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
