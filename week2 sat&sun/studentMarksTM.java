import java.util.TreeMap;
public class studentMarksTM {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentMarks = new TreeMap<>();
        studentMarks.put("Rahul", 85);
        studentMarks.put("Saran", 90);
        studentMarks.put("Sadiya", 78);
        studentMarks.put("Priya", 92);
        for (String key : studentMarks.keySet()) {
            System.out.println(key + ": " + studentMarks.get(key));
        }
    }
    
}
