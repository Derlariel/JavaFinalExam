package Inheritance;

public class Staff extends Person {
    private String officeLocations;
    private String Position;

    public String getOfficeLocations() {
        return officeLocations;
    }

    public void setOfficeLocations(String officeLocations) {
        this.officeLocations = officeLocations;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
