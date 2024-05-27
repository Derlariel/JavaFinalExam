package Overiding;

public class MainOveriding {
    public static void main(String[] args) {

        testCardMember();
    }

    static void testCardMember(){
        PlatinumCard p1 = new PlatinumCard();
        GoldCard g1 = new GoldCard();
        SilverCard s1 = new SilverCard();
        System.out.println("total point : " + p1.calculatePoint(1000f));
        System.out.println("Platinum Card : " + p1.disCount(1000f));
        System.out.println("Gold Card : " + p1.disCount(500f));
        System.out.println("Silver Card : " + p1.disCount(3000f));
    }

}
