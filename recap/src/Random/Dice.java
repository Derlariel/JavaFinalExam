package Random;

import java.util.Random;

public class Dice {
    private int[] frequency = new int[6];

    public int roll(){
        //random between 1-6
        Random dice = new Random();
        int face = dice.nextInt(6)+1;
        frequency[face - 1] += 1;
        return face;
    }

    public int[] getFrequency() {
        return frequency;
    }
}
