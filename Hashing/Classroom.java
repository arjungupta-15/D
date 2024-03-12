package Hashing;
import java.util.*;

public class Classroom {
    
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();
        //Insert 0(1)
        hm.put("India" , 100);
        hm.put("dubai",10);
        hm.put("china",300);

        System.out.println(hm);

        //Get 0(1)

        int pop = hm.get("India");
        System.out.println(pop);

        System.out.println(hm.get("indo"));

        //Containkeys
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("I"));

        //Remove
        System.out.println(hm.remove("dubai"));
        System.out.println(hm);
    }
}

