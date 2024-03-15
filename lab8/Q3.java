// Write a program to find out first non repeated character from input String.

public class Q3 {
    public static void main(String[] args) {
        String input = "Hello World";
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))) {
                System.out.println("First non repeated character: " + input.charAt(i));
                break;
            }
        }
    }
}