package me.sit.dev;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaMap {

    public static void main(String[] args) {
        // of string and integer type
        // Type of key is String
        // Type of value is Integer
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard put() method
        map.put("John", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Update key
        map.put("John", 40);

        // Remove key & value pair
        System.out.println("Map before removes key Johns: " + map);
        map.remove("John"); // remove the element with key "John"
        System.out.println("Map after removes key Johns: " + map);

        // Get value by key
        int value = map.get("sachin");
        System.out.println("Value of key sachin: " + value);

        // Check if map contains key
        boolean isContains = map.containsKey("vaibhav");
        System.out.println("Is map contains key vaibhav: " + isContains);

        // Check if map contains value
        boolean isContainsValue = map.containsValue(20);
        System.out.println("Is map contains value 20: " + isContainsValue);

        // Get size of map
        int size = map.size();
        System.out.println("Size of map: " + size);

        // Loop only keys
        System.out.println("Loop only keys");
        Set<String> allKeys = map.keySet();
        for (String key : allKeys) {
            System.out.println("Key: " + key);
        }

        // Loop only values
        System.out.println("Loop only values");
        for(int val : map.values()) {
            System.out.println("Value: " + val);
        }

        // Loop both keys and values
        System.out.println("Loop both keys and values");
        for (var entry : map.entrySet()) {
            String key = entry.getKey();
            int v = entry.getValue();
            System.out.println(key + ": " + v);
        }

        // Clear all elements
        map.clear();
    }
}
