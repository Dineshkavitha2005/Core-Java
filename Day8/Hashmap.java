
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        // to store key-value pair in hashmap
        map.put("Name ", " Kavin");
        map.put("House No ", " 29/C");
        map.put("Area ", " Saravanampatti");
        map.put("District ", " Coimbatore");
        System.out.println("Original Map: "+ map);
        // put(key, updated value) --> update an element in hashmap
        map.put("House No ", "40/A");
        System.out.println("After update House No to 40/A: "+ map);
        // get() --> using key to get the value
        System.out.println("Area: "+ map.get("Area "));
        // containsKey() --> to chech key is exist on map
        System.out.println("District contains? "+ map.containsKey("District "));
        // containsvalue() --> to check value is exist on map
        System.out.println("Kavin contains? "+ map.containsValue(" Kavin"));
        // find size of the map
        System.out.println("size: "+ map.size());
        // remove any element
        map.remove("Area ");
        System.out.println("After removing the area: "+map);
        // Iterate over map
        for(Map.Entry<String, String> dataset: map.entrySet()){
            // retrive key
            String key = dataset.getKey();
            // retrive value
            String value = dataset.getValue();
            System.out.println(key +" : "+ value);
        }
    }
    
}
