import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static Character getKeyByValue(HashMap<Character, Integer> map, int value) { //Important
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',65);
        map.put('B',66);
        map.put('C',67);

        int val = map.get('A'); //int val = map.get('D'); NullPointerException

        System.out.println(map.size()); //3
        System.out.println(map.containsKey('D')); //false
        System.out.println(map.containsValue(54)); //false

        //iterate over hashmap
        for (Map.Entry<Character,Integer> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
        //iterate over keys
        for (Character name : map.keySet())
            System.out.println("key: " + name); //A,B,C
        // iterate over values
        for(Integer url : map.values())
            System.out.println("value: " + url); //65,66,67

        System.out.println(getKeyByValue(map,65));
    }
}
