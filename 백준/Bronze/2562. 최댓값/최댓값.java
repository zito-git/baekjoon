import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 9;
        int[] arr = new int[n];
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                count = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}