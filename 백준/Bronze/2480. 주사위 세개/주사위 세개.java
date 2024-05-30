import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int max = 0;

        if (n1 == n2 && n2 == n3 && n1 == n3) {
            System.out.println(n1 * 1000 + 10000);
        } else if (n1 == n2) {
            System.out.println(n1 * 100 + 1000);
        } else if (n1 == n3) {
            System.out.println(n1 * 100 + 1000);
        } else if (n2 == n3) {
            System.out.println(n2 * 100 + 1000);
        } else {
            if (n1 > n2 && n1 > n3) {
                max = n1;
            } else if (n2 > n1 && n2 > n3) {
                max = n2;
            } else {
                max = n3;
            }
            System.out.println(max * 100);
        }
    }
}