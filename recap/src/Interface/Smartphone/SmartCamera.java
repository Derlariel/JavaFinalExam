package Interface.Smartphone;

public class SmartCamera implements ICamera,IGPS {
    @Override
    public void takePhoto() {

    }

    @Override
    public void changeAperture() {

    }

    @Override
    public void changeShutter() {

    }

    @Override
    public void deletePhoto() {

    }

    @Override
    public double receiveLat() {
        return 0;
    }

    @Override
    public double receiveLon() {
        return 0;
    }

    @Override
    public boolean checkStatus() {
        return false;
    }
}
