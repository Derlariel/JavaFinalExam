package Overiding;

public class PlatinumCard extends Member {
    // annotations ส่วนที่บอกรายละเอียดบางอย่าง
    @Override
    public double disCount(double amount) {
        if (amount >= 500.00){
            return amount * .2f;
        }else
            System.out.println("can't use disCount");
        return 0f;

//        return super.disCount(amount);
    }
    @Override
    public double rewardPoint() {
        return 3f;
    }

    @Override
    public int calculatePoint(double amount) {
        return super.calculatePoint(amount);
    }
}
