public class Doubloon {
    public static boolean isDoubloon(String s) {
    s = s.toLowerCase();
    for (char c = 'a'; c <= 'z'; c++) {         
        int count = 0;
        for (int i = 0; i < s.length(); i++) {  
            if (s.charAt(i) == c) {
                count++;
            }
        }
        if (count != 0 && count != 2) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        System.out.println(isDoubloon("Abba")); 
        System.out.println(isDoubloon("wabababababa")); 
        System.out.println(isDoubloon("Dada")); 
    }
}
