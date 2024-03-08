package Datas;

import java.util.HashMap;
import java.util.Map;

public class hashymap {
    public static void main(String[] args) {
        Map<String, Integer> arrayCars = new HashMap<>();
        arrayCars.put("Toyota", 6);
        arrayCars.put("Ford", 10);
        arrayCars.put("Honda", 5);
        arrayCars.put("Chrysler", 4);
        arrayCars.put("Honda", 10);

        System.out.println(arrayCars.get("Honda"));
        System.out.println(arrayCars.containsValue(2));
        System.out.println(arrayCars.containsKey("Honda"));
        System.out.println(arrayCars.size());
    }
}
