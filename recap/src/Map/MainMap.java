package Map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
//        testMap();
        testCreateMap();
    }

    static void testMap(){
        //HashMap implement Map
        Map<String, String> map = new HashMap<String, String>();
        map.put("foo", "bar");
        map.put("thailand", "TH");
        map.put("Japan", "JP");

//        System.out.println(map.get("thailand"));
        for (Map.Entry<String,String> item: map.entrySet()){
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n",key,value);
        }

        System.out.println("--------------------------------");

        map.put("thailand","Kong");
        for (Map.Entry<String,String> item: map.entrySet()){
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n",key,value);
        }

        if (map.containsValue("JP")){
            System.out.println("Found JAPAN");
        }

        }
        static void testCreateMap(){
        Map<String,Country> cn = new HashMap<String,Country>();
        cn.put("TH",new Country("ประเทศไทย","Thailand"));
            System.out.println(cn.get("TH"));
        }
    }

