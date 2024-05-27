package Interface;

public class Car implements Vehicle{
    @Override
    public int cashRate() {
        return 40;
    }

    @Override
    public int ePassRate() {
        return 35;
    }
}
