import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n1 + " * " + i + " = " + n1 * i);
        }
    }
}