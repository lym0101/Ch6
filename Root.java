import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        double sqrt = squareRoot();
        System.out.println(sqrt);
    }
    public static double squareRoot() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a positive number: ");

        double b = in.nextDouble();

        while (Math.abs(est - b) > 0.0001) {
            double a = b / 2;
            double est = (a + b) / 2;

            b = est;
        }
        return est;
    }
}
