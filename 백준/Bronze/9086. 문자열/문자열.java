import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }
        for (int j = 0; j < arr.length; j++) {
            String result = arr[j];
            System.out.println(result.charAt(0) + "" + result.charAt(result.length() - 1));
        }
    }
}