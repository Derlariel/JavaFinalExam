package Random;

public class mainDice {
    public static void main(String[] args) {
//        testDice();
        testDiceR();

    }
    static void testDice(){
        long start = System.currentTimeMillis();
    Dice dice = new Dice();
    for (int i = 0; i<10000; i++){
        System.out.println(dice.roll());
     }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time = %d",end - start);

//    for (int i = 0; i < dice.getFrequency().length; i++){
//        System.out.printf("face %d occurs %d times\n", i+1,dice.getFrequency()[i]);
//        }
    }
    public static void testDiceR(){
        Dice2 diceR = new Dice2();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20; i++){
            ;
            System.out.println(Dice2.numberToCharacter(diceR.roll()));
        }
        long stop = System.currentTimeMillis();
        System.out.printf("elapsed time = %d", stop - start);
        System.out.println("Show frequency times");
        diceR.showFrequency();

    }
}
