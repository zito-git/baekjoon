import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = n / 4;
        for (int i = 0; i < total; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}