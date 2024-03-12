package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
         //Create
        HashMap<String, Integer> hm = new HashMap<>();
        //Insert 0(1)
        hm.put("India" , 100);
        hm.put("dubai",10);
        hm.put("china",300);
        hm.put("Pakis", 30);

        // Iteration 
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("keys= "+k+" value = "+hm.get(k));
        }
    }
}
