package Interface;

public class Bus implements Vehicle{
    @Override
    public int cashRate() {
        return 120;
    }

    @Override
    public int ePassRate() {
        return 100;
    }
}
