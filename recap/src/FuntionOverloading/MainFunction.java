package FuntionOverloading;
import FuntionOverloading.Discount.*;
public class MainFunction {
    public static void main(String[] args) {
//        String s = "sunfolwer";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(3,6));
//
//        System.out.println(Add.addNumber(1.2,3));
//        System.out.println(Add.addNumber(2f,3,5));
//        System.out.println(Add.addNumber(3f,3));

        System.out.println(Discount.discount(100f));
        System.out.println(Discount.discount(100f,.1f));
        System.out.println(Discount.discount(100f,.2f));
    }

}
