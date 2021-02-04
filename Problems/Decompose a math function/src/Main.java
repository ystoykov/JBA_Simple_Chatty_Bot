import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        double res;
        if (x <= 0) {
            res = f1(x);
        } else if (0 < x && x < 1) {
            res = f2(x);
        } else {
            res = f3(x);
        }
        return res;
    }

    //implement your methods here
    public static double f1(double a) {
        return a * a + 1;
    }

    public static double f2(double a) {
        return (double) 1 / (a * a);
    }

    public static double f3(double a) {
        return a * a - 1;
    }
}