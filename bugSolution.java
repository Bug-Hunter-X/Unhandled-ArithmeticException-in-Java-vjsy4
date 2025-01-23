public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            // You could add more robust error handling here.
        }
    }
}