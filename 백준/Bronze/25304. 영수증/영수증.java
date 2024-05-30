import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = x * y;
            total = total - sum;
        }
        if (total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}