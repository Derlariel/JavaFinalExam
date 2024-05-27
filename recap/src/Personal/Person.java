package Personal;

public class Person {
    private String firstName,lastName,nickName,gender;

    public Person(String firstName, String lastName, String nickName, String gender) {
        this.firstName = firstName.trim().substring(0,1).toUpperCase() +
                firstName.trim().substring(1).toLowerCase();
        this.lastName = lastName;
        this.nickName = nickName;
        this.gender = gender;
    }

    public Person() {
        System.out.println("Person constructor");
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
