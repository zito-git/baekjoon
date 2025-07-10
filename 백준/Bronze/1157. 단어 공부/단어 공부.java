import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine().toUpperCase();

        int[] numArr = new int[26];
        int max = 0;
        Character result = null;

        for (int i = 0; i < words.length(); i++) {
            numArr[words.charAt(i) - 'A']++;
        }

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > max) {
                result = (char) (i + 'A');
                max = numArr[i];
            } else if (numArr[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}