// Provide two ways to check if a String contains only digit.

public class Q4 {
    public static void main(String[] args) {
        String input = "12345";
        boolean isDigit = true;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isDigit = false;
                break;
            }
        }
        if (isDigit) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String does not contain only digits");
        }
    }
}