import java.util.LinkedHashMap;
public class maintainOrderLHM {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> products= new LinkedHashMap<>();
        products.put("Laptop", 1000);
        products.put("Mouse", 25);
        products.put("Keyboard", 75);
        products.put("Monitor", 200);
        for (String key : products.keySet()) {
            System.out.println(key + ": " + products.get(key));
        }
    }
    
}
