package July.ex_28072024;

public class lab055 {
    public static void main(String[] args) {

        car car = new car();

        car.carname = "lambo";
        car.engine = "v12";
        car.gearbox = "7 transmission";
        car.tyre = 4;

        System.out.println(car.carname);
        System.out.println(car.gearbox);
        System.out.println(car.engine);
        System.out.println(car.tyre);
        car.started();
        car.running();
    }

}
