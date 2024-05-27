package Overiding;

public abstract class Member {
    private String firstName,lastName;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Member() {
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
    public double disCount(double amount) {
    if (amount >= 1000f){
         return amount * .01f;
        }else {
        System.out.println("cannot use distance" + 0f);
        }
    return amount;
    }
    public abstract double rewardPoint();

    public  int calculatePoint(double amount){
        return (int)((amount / 20) * rewardPoint());
    }
    @Override
    public String toString() {
        return String.format("firstName = %s, lastName = %s", firstName,lastName);
    }
}
