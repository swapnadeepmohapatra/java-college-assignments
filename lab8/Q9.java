// How to check if two strings are anagrams of each other?

public class Q9 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
            return;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("Strings are not anagrams");
                return;
            }
        }
        System.out.println("Strings are anagrams");
    }
}