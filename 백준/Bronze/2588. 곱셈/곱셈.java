import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while (n2 > 0) {
            list.add(n2 % 10);
            n2 = n2 / 10;
        }

        int res1 = n1 * list.get(0);
        System.out.println(res1);
        int res2 = n1 * list.get(1);
        System.out.println(res2);
        int res3 = n1 * list.get(2);
        System.out.println(res3);

        System.out.println(res1 + res2 * 10 + res3 * 100);


    }

}