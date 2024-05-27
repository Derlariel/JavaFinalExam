package FuntionOverloading;

public class Discount {
    static double discount(double amount){
        return amount * 0.5f;
    }
    static double discount(double amount, double pctDiscount){
        return amount * pctDiscount;
    }
    private static double discount(double amount, String customerType){
        double pctDiscount = 0.0f;
        switch (customerType.toUpperCase()){
            case "VIP":
            pctDiscount = .2f;
            break;
            case "GOLD":
                pctDiscount = .1f;
                break;
            default:
                pctDiscount = .05f;
        }
        return discount(amount, pctDiscount);
    }
}
