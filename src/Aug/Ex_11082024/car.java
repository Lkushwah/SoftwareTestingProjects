package Aug.Ex_11082024;

abstract class car extends Engine{


    @Override
    void opencar() {
        System.out.println("Open car with keys");

    }

    @Override
    void closecar() {
        System.out.println("close car with keys");
    }

    @Override
    void partgearbox() {
        System.out.println("part of gearbox");
    }

    @Override
    void enginestop() {
        System.out.println("engine stop");

    }

    @Override
    void enginestart() {
        System.out.println("engine start");
    }

    @Override
    void oilmanagement() {
        System.out.println("oilmanagement");
    }
}
