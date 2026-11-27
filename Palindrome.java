import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String line = in.nextLine();

        if (isPalindrome(line)) {
            System.out.println("\"" + line + "\" is a palindrome.");
        } else {
            System.out.println("\"" + line + "\" is not a palindrome.");
        }
        in.close();
    }
    public static boolean isPalindrome(String str) {
        String lower = str.toLowerCase();
        String letters = "";
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters += c;
            }
        }
        int left = 0;
        int right = letters.length() - 1;
        while (left < right) {
            if (letters.charAt(left) != letters.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}