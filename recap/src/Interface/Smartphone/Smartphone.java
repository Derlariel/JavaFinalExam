package Interface.Smartphone;

public class Smartphone implements IPhone,ICamera,IGPS{

    @Override
    public void takePhoto() {
        System.out.println("Take Photo");
    }

    @Override
    public void changeAperture() {
        System.out.println("Change Aperture");

    }

    @Override
    public void changeShutter() {
        System.out.println("Change Shutter");
    }

    @Override
    public void deletePhoto() {
        System.out.println("Delete Photo Successfully");
    }

    @Override
    public void call(String PhoneNumber) {

    }

    @Override
    public void hangup() {

    }

    @Override
    public void sendSms(String PhoneNumber, String Message) {

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
