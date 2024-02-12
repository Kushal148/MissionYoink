package collections;

import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a","s");
        map.put("b","g");

        System.out.println(map.get("a"));
    }
}
