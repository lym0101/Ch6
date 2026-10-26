public class canSpell {
    public static boolean canSpell(String word, String letters) {
        word = word.toLowerCase(); // convert to lowercase for uniformity
        letters = letters.toLowerCase(); // convert to lowercase for uniformity
        int[] letterCounts = new int[26]; // array to count occurrences of each letter in letters
        for (char c : letters.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCounts[c - 'a']++; // increment count for this letter
            }
        }
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                if (letterCounts[c - 'a'] == 0) { // check if the letter is available
                    return false;
                }
                letterCounts[c - 'a']--; // use one occurrence of this letter
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canSpell("hello", "hleol")); // true
        System.out.println(canSpell("world", "dlrow")); // true
        System.out.println(canSpell("java", "jav")); // false
    }
}
