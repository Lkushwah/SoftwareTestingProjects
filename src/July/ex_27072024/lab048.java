package July.ex_27072024;

public class lab048 {
    public static void main(String[] args) {

        int[] salary = {7,54,210,10,65,6};

//        System.out.println(Math.max(salary[]));
        int max = 0;
        int min =0;
        for (int i = 0; i < salary.length ; i++) {

            if (salary[i]> max) {
            max = salary[i];
            }

            if (salary[i] <max) {
            min = salary[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
