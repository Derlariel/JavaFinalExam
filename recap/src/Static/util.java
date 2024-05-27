package Static;

public class util {
    public static String capitalizedFirstCharacter(String s) {
        return s.substring(0,1).toUpperCase()+ s.substring(1).toLowerCase();
    }
    public static String removeAllNonNumeric(String s) {
        return s.replaceAll("[\\D]","");
    }
}
