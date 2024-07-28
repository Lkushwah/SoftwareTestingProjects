package ex_21072024;

public class lab029 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {

            if (i%3 == 0 && i%5==0){
                System.out.println(i+"fizzbuzz");
            }

            if (i%3 == 0) {
                System.out.println("fizz");
            }
            else if (i%5 == 0) {
                System.out.println("buzz");
            }
            else System.out.println(i);
        }
    }
}
