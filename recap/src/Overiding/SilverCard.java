package Overiding;

public class SilverCard extends Member {
    @Override
    public double rewardPoint() {
        return 1f;
    }

    @Override
    public double disCount(double amount) {
        if (amount >= 2000.00){
            return amount * .05f;
        }else
            System.out.println("cannot use disCount");
        return amount;
    }
}
