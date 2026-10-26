public class gauss {
    public static double Gauss(double x, int n) {
    double term = 1.0; 
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
        sum += term;
        term = term * (-x * x) / (i + 1); 
    }
    return sum;
}
    public static void main(String[] args) {
        System.out.println(Gauss(1, 10));
        System.out.println(Gauss(2, 10));    
    }
}
