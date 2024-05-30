import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();

        for (int i = 0; i < n1; i++) {
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            list.add(n2);
            list.add(n3);
        }

        for (int i = 0; i < list.size(); i += 2) {
            System.out.println(list.get(i) + list.get(i + 1));
        }
    }
}