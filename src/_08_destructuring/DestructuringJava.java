package _08_destructuring;

import java.util.HashMap;
import java.util.Map;

public class DestructuringJava {
    public static void main(String[]args) {
        HashMap<String, String> values = new HashMap<>();
        values.put("key 1", "value 1");
        values.put("key 2", "value 2");

        for (Map.Entry<String, String> item : values.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.println(String.format("Key: %s Value: %s", key, value));
        }
    }
}
