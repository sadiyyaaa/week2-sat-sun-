import java.util.HashMap;
public class wordFrequency {
    public static void main(String[] args) {
        String  sentence = "java is easy and java is powerful";
        String[] words = sentence.split(" ");
        HashMap<String, Integer> Map = new HashMap<>();
        for (String word : words) {
            if (Map.containsKey(word)) {
                Map.put(word, Map.get(word) + 1);
            } else {
            Map.put(word, 1);
            }
        }
        for (String key : Map.keySet()) {
            System.out.println(key + ": " + Map.get(key));
        }   
    }
    
}
