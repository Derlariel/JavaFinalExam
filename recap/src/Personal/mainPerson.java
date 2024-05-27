package Personal;

public class mainPerson {
    public static void main(String[] args) {
        testPetient();
    }
    static void testPerson(){
        Person p = new Person("Yanisa","Phongthirakan","Maikeaw","Female");
        System.out.println(p.getFirstName());
    }
    static void testPetient(){
        Patient t = new Patient("Kongphob","Kongsan","Tonmai","Male",164f,62f);
//        System.out.println(t.getFirstName()+" "+t.getLastName()+ " " + t.getGender()+ " " + t.getHeight()+" "+t.getWeight());
        System.out.println(t.toString());
    }
}
