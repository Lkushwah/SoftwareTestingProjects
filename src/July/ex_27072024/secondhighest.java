package July.ex_27072024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class secondhighest {

    public static void main(String[] args) {
        int[] salary = {7,10,4,13,25,18,9,8,17};

        Arrays.sort(salary);
        System.out.println(salary[salary.length-2]);
        int max = 0;
        int secondmax= 0;
        for (int i = 0; i <salary.length; i++) {

            if (salary[i]>max){
                secondmax =   max;
                max= salary[i];
            }

        }
        System.out.println(secondmax);

    }
}
