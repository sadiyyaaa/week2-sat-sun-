import java.util.ArrayList;
public class GenericExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    
}
