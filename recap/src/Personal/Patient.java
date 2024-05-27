package Personal;

public class Patient extends Person {
    private double height,weight;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append("firstname = ").append(getFirstName());
        sb.append(" lastname = ").append(getLastName());
        sb.append(" nickname = ").append(getNickName());
        sb.append(" gender = " ).append(getGender());
        sb.append(" height = " ).append(height);
        sb.append(", weight=" ).append(weight);
        sb.append('}');
        return sb.toString();
    }

    public Patient(String firstName, String lastName, String nickName, String gender, double height, double weight) {
        super(firstName,lastName,nickName,gender);
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
