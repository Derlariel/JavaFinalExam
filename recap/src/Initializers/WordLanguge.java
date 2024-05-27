package Initializers;

import java.util.HashMap;
import java.util.Map;

public class WordLanguge {
    private static Map<String, String> words = new HashMap<String,String>();

    static {
        System.out.println("Static init was called");
        words.put("Hello" , "Sawatdee (kub/kah)");
        words.put("Fine" , "Sabai dee (kub/kah)");
        words.put("How old are u? " , "A u tao rai? (kub/kah)");
    }
    public static String search(String keyWord) {
    return words.getOrDefault(keyWord, "word found");
    }}
