import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            list.add(sc.nextInt());
        }

        int cnt = 0;
        for (int j = 0; j < list.size(); j += 2) {
            cnt++;
            System.out.println("Case #" + cnt + ": " + (list.get(j) + list.get(j + 1)));
        }


    }
}