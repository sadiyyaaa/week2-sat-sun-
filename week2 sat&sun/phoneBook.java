import java.util.HashMap;
public class phoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook=new HashMap<>();
        phoneBook.put("Rahul", "8762501880");
        phoneBook.put("saran", "5766622250");
        phoneBook.put("sadiya", "3272511880");
        phoneBook.put("priya", "9762501880");
        if(phoneBook.containsKey("Rahul")){
            System.out.println("Rahul's number is:"+phoneBook.get("Rahul"));
        }
        else{
            System.out.println("contact not found");
        }
    }
}