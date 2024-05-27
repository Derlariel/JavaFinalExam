package Overiding;

public class GoldCard extends Member{
    @Override
    public double disCount(double amount) {
        if (amount > 1000.00){
            return amount * .1f;
        }else
            System.out.println("can't use disCount");
        return amount;
    }

    @Override
    public double rewardPoint() {
        return 2f;
    }
}
