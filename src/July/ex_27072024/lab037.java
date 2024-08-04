package July.ex_27072024;

public class lab037 {
    public static void main(String[] args) {

        String[] weekdays ={"mon","tues","wed","thru" , "friday", "sat", "sun"};

        for (int i = 0; i <= weekdays.length; i++) {
            System.out.println(i+"->>"+ weekdays[i+1]);

        }
    }
}
