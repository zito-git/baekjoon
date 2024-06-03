import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int n1, n2;
        do {
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            list.add(n1);
            list.add(n2);
        } while (n1 != 0 && n2 != 0);


        for (int i = 0; i < list.size() - 2; i += 2) {
            System.out.println((list.get(i) + list.get(i + 1)));
        }


    }
}