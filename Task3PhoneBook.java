import java.util.HashMap;
import java.util.Map;
public class Task3PhoneBook {
    public static void PhoneBook() {
        
        Map<Integer, String> phoneMap = new HashMap<>();
        add(phoneMap, 843456789, "Ivanov");
        add(phoneMap, 542326858, "Biden");
        add(phoneMap, 465874569, "Cohen");
        add(phoneMap, 89000444, "Nikolay II");
        add(phoneMap, 111112589, "Vinni");
        add(phoneMap, 11001, "Vinni");
        System.out.println(phoneMap);
        get(phoneMap, "Vinni");
    }
    public static void add(Map<Integer,String> phoneMap, int phoneNumber, String surname) {
        phoneMap.put(phoneNumber, surname);
    }
    public static void get(Map<Integer, String> phoneMap, String surname) {
        for(Map.Entry<Integer, String> entry: phoneMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            if (value == surname){
                System.out.println(value + " " + " номер телефона " + key);
            }
        }
    } 
}

