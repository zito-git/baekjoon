import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            list.add(n1);
            list.add(n2);
        }
        for (int i = 0; i < list.size(); i += 2) {

            System.out.println("Case #" + (++count) + ": " + list.get(i) + " + " + list.get(i + 1) + " = " + (list.get(i + 1) + list.get(i)));
        }
    }
}
