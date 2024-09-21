package Aug.Ex_04082024;

public class ATBperson {
    String name;
    long number;

     ATBperson() {
//         System.out.println("Object is created");
    }

    public ATBperson(String name) {
        this.name = name;
//        System.out.println(name);
    }
    ATBperson(String name, long phn){
        this.name = name;
         this.number = phn;
//        System.out.println(name);
//        System.out.println(phn);
    }
}
