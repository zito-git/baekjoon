import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String input = sc.next();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            int result = input.charAt(input.length() + (i * -1));
            result = Character.getNumericValue(result);
            sum += result;
        }
        System.out.println(sum);
    }
}