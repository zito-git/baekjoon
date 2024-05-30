import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();


        if (M < 45) {
            H--;
            if (H == -1) {
                H = 23;
            }
            M = M - 45 + 60;
            System.out.println(H + " " + M);
        } else {

            M = M - 45;
            System.out.println(H + " " + M);
        }
    }
}