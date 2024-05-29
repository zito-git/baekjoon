import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 > 0 && n2 > 0) {
            System.out.println("1");
        } else if (n1 < 0 && n2 > 0) {
            System.out.println("2");
        } else if (n1 < 0 && n2 < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}