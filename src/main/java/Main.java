public class Main {
    static void main() {
        System.out.println("Maven Task is on!");
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String getFirstLetter(String text) {

        if (text == null || text.isEmpty()) {
            return null;
        }

        return String.valueOf(text.charAt(0));
    }

    public static int divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        return a / b;
    }
}
