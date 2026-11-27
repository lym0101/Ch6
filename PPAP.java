import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two words: ");
        String object1 = in.next();
        String object2 = in.next();
        System.out.println("I have a "+ object1 + " and I have a " + object2);
        System.out.println(ppap(object1, object2));
        in.close();
    }

    public static String ppap(String object1, String object2) {
        object2 = object2.substring(0, 1).toUpperCase() + object2.substring(1);
        return "Uh! " + object2 + " " + object1;
    }
}
