import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = reverse(sc.next());
        int num2 = reverse(sc.next());

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    static int reverse(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(input.length() - i - 1);
        }
        int num = Integer.parseInt(result);
        return num;
    }


}