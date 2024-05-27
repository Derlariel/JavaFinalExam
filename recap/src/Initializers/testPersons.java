package Initializers;

public class testPersons {
    public static void main(String[] args) {
        testInitializers();
        testWordLanguage();
    }
    static void testInitializers(){
        Persons p1 = new Persons();
        Persons p2 = new Persons();
    }
    static void testWordLanguage(){
        System.out.println(WordLanguge.search("Hello"));
        System.out.println(WordLanguge.search("Fine"));
        System.out.println(WordLanguge.search("How old r u"));
    }
}
