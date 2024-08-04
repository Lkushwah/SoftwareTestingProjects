package July.ex_20072024;

import java.util.Scanner;

public class lab012 {
    public static void main(String[] args) {
        //vowel aeiou
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your vowel");
        char word = sc.next().charAt(0);


        switch(Character.toLowerCase(word)){

            case 'a':
                System.out.println(word+ "is a vowel");break;
            case 'e':
                System.out.println(word+ "is a vowel");break;
            case 'i':
                System.out.println(word+ "is a vowel");break;
            case 'o':
                System.out.println(word+ "is a vowel");break;
            case 'u':
                System.out.println(word+ "is a vowel");break;
            default:
                System.out.println("consonant");break;
        }
        System.out.println("Loop out");

        sc.close();

    }

}
