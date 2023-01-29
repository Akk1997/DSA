import java.util.*;

class Prog6 {
    // Hashmap Prectice
    public static void main(String args[]) {
        Map<String, Integer> ma = new HashMap<>();
        ma.put("Akki", 1);
        ma.put("Sakshi", 2);
        ma.put("Ravi", 3);
        ma.put("Chintu", 5);
        ma.put("Priyanshi", 6);
        ma.put("Dev", 7);
        System.out.print("HashMap :" + ma + "\n");
        ma.remove("Akki");
        System.out.print("New Hashmap is : " + ma + "\n");
        if (ma.containsKey("Sakshi")) {
            System.out.println("Contains");
        }
        // Set<String> hm = ma.keySet();
        System.out.print(ma.get("Dev"));

    }
}