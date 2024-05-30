import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int plus = scanner.nextInt();

        int res1 = M + plus;

        if (res1 < 60) {
            System.out.println(H + " " + res1);
        } else {
            H = res1 / 60 + H;
            M = res1 % 60;
            if (H >= 24) {
                H -= 24;
            }
            System.out.println(H + " " + M);
        }
    }
}