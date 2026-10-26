public class Scrabble {
    public static boolean scrabble(String tiles, String word) {
    for (int i = 0; i < word.length(); i++) {
        int index = tiles.indexOf(word.charAt(i));
        if (index == -1) {
            return false;
        }
        tiles = tiles.substring(0, index) + tiles.substring(index + 1);
    }
    return true;
}

    public static void main(String[] args) {
        System.out.println(scrabble("hello", "hleol"));
        System.out.println(scrabble("world", "dlrow"));
        System.out.println(scrabble("java", "jav"));
    }
}
