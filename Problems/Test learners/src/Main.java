import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String s = null;
        switch (x) {
            case 1 :
                s = "Yes!";
                break;
            case 2 :
                s = "No!";
                break;
            case 3 :
                s = "No!";
                break;
            case 4 :
                s = "No!";
                break;
            default:
                s = "Unknown number";
                break;
        }
        System.out.println(s);
    }
}