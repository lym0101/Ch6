import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = in.nextInt();
        System.out.println(num + " in binary is " + ctb(num));
        in.close();
    }
    public static String ctb(int num) {
        if (num == 0) {
            return "0";
        }
        String binary = "";
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }
        return binary;
    }
}
