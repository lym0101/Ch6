import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase to be translated: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println("PigLatin Translation: " + pigLatin(line));
        in.close();
    }
    public static String translateWord(String word) {
        if (word.length() <= 2) {
            return word;
        }
        return word.substring(1) + word.charAt(0) + "ay";
    }
    public static String pigLatin(String m) {
        String result = "";
        int start = 0;
        while (start < m.length()) {
            int space = m.indexOf(" ", start);
            if (space == -1) {
                space = m.length();
            }
            String word = m.substring(start, space);
            result += translateWord(word);
            if (space < m.length()) {
                result += " ";
            }
            start = space + 1;
        }
        return result;
    }
}
