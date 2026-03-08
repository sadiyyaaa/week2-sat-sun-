class Box<T> {
    T value;
    void setVslue(T value) {
        this.value = value;
    }
    void printValue() {
        System.out.println("Value: " + value);
    }
}
public class GenericBoxExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setVslue(10);
        intBox.printValue();
        Box<String> strBox = new Box<>();
        strBox.setVslue("Hello, Generics!");
        strBox.printValue();
    }
}
