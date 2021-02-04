import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int res = 0;
        if (a >= b && a >= c) {
            res = 1;
        } else if (a <= b && b >= c) {
            res = 2;
        } else if (c >= a && c >= b) {
            res = 3;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}