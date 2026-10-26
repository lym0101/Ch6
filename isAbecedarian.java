public class isAbecedarian {
    public static boolean isAbecedarian(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAbecedarian("abcde"));
        System.out.println(isAbecedarian("hello"));
        System.out.println(isAbecedarian("aegmno"));
    }
}
