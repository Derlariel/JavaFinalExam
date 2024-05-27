package Random;

import java.util.Random;

public class Dice2 {
    private int[] frequency = new int[6];
   private static Random R = new Random();
   private int count = 0;
   private char characterDice;
   public static char numberToCharacter(int face){
       return (char) (face - 1 + '\u2680');
   }

    public int roll(){
        count++;
        //random between 1-6
//        Random dice = new Random();
        int face = R.nextInt(6) + 1;
        frequency[face - 1] += 1;
//        characterDice = (char)(face - 1 + '\u2680');
        return face;
    }

    public int[] getFrequency() {
        return frequency;
    }
    public void showFrequency(){
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("face %d occurs %d times (%.2f)\n",i+1,frequency[i],(double)frequency[i]/(double)count);
        }
    }
    public char getCharacterDice() {
        return characterDice;
    }
}
