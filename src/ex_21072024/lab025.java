package ex_21072024;

public class lab025 {
    public static void main(String[] args) {
        for (int i = 0; i <50; i++) {
            if (i%2==0 ) {
                System.out.println(i+"is even");
                continue;
            }
            else
                System.out.println(i + "is odd");

        }
    }
}
