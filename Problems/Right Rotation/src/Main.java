import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arstr = str.split(" ");
        int count = scanner.nextInt() % arstr.length;
        int[] arint = new int[arstr.length];
        for (int i = 0; i < arint.length; i++) {
            arint[i] = Integer.parseInt(arstr[i]);
        }
        for (int i = 0; i < count; i++) {
            int temp = arint[arint.length - 1];
            System.arraycopy(arint, 0, arint, 1, arint.length - 1);
            arint[0] = temp;
        }

        for (int i: arint
             ) {
            System.out.print(i + " ");
        }

    }
}