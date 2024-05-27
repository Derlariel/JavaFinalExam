package Initializers;

public class Persons {
    private String firstName,lastName;

    public Persons(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    static {
        System.out.println("Static initializer was called");
    }

    public Persons() {
        System.out.println("Persons constructor was called");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
