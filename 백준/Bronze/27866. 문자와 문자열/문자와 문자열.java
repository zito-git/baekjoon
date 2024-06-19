import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = sc.nextInt();
        String[] words = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            words[i] = input.substring(i, i + 1);
        }

        System.out.println(words[num-1]);
    }
}