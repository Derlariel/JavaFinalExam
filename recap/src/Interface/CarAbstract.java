package Interface;

public class CarAbstract extends VehicleAbstract {
    @Override
    public int cashRate() {
        return 40;
    }

    @Override
    public int ePassRate() {
        return 35;
    }
}
